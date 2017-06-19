package controller;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import model.Buch;
import model.Lehrer;
import model.Storage;
import model.UnterMittelStufe;
public class ExelRead {
	
	Storage storage;
	
	public ExelRead (Storage storage) {
		this.storage = storage;		
	}
	
	public boolean klassenlisteScannen (String pfad, int jahrgangsstufe, char klasse, Lehrer lehrer) throws IOException {
		System.out.println("Stellen Sie sicher, dass die Exel Datei folgenden Aufbau hat: 1. Spalte Nachname, 2. Spalte Vorname, 3. Spalte Zweig, 4. Spalte Religion, 5. Splate Geb.Dat.!");
		File src = new File (pfad);
		FileInputStream fis;
		try {
			fis = new FileInputStream (src);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Datei nicht gefunden");
			return false;
		}
		XSSFWorkbook wb = new XSSFWorkbook (fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);
		int lastRow = sheet1.getLastRowNum();
		System.out.println("Groesse der Klasse beträgt: "+lastRow);
		UnterMittelStufe klasseobj = storage.addKlasse(jahrgangsstufe, lastRow, klasse, lehrer);
		
		for (int i = 0; i <= lastRow; i++) {
			storage.addUnterMittelSchueler(sheet1.getRow(i).getCell(2).getStringCellValue(), sheet1.getRow(i).getCell(1).getStringCellValue(), sheet1.getRow(i).getCell(5).getStringCellValue(), klasseobj, sheet1.getRow(i).getCell(3).getStringCellValue(), sheet1.getRow(i).getCell(4).getStringCellValue());
		}
		System.out.println("Scannen abgschlossen, Streams werden geschlossen");
		wb.close();
		fis.close();
		System.out.println("[Scannen] Done.");
		return true;
	}
	
	public boolean idListeScannen (String pfad, int jahrgangsstufe, char klassen, Buch buch) {
		//TODO Nachdem die IDs der Aufträge eingetragen wurden müssen sie hier für jedes Buch eingescannt werden!
		return true;
	}
}
