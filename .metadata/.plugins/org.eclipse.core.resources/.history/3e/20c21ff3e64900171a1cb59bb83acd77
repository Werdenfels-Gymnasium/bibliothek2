package model;
import java.util.LinkedList;
import java.io.*;

public class Storage {
	//Alles in Listen abspeichern
	LinkedList<Auftrag> auftraege;
	LinkedList<Buch> buecher;
	//Arten von Entleihern
	LinkedList<UnterMittelSchueler> unterMittelSchueler;
	LinkedList<Lehrer> lehrer;
	//Klassen und Kurse
	LinkedList<UnterMittelStufe> unterMittelStufe;
	
	public Storage () {
	}
	
	public void erststart () {
		auftraege = new LinkedList<Auftrag>();
		System.out.println("Auftragsliste erstellt!");
		buecher = new LinkedList<Buch>();
		System.out.println("Buchliste erstellt!");
		unterMittelSchueler = new LinkedList<UnterMittelSchueler>();
		System.out.println("Schuelerliste (Unter- & Mittelstufe) erstellt!");
		lehrer = new LinkedList<Lehrer>();
		System.out.println("Lehrerliste erstellt!");
		unterMittelStufe = new LinkedList<UnterMittelStufe>();
		System.out.println("Klassenliste erstellt!");
		
	}
	
	public boolean speichern () {
		if (auftraegeSpeichern()) {
			System.out.println("Auftraege erfolgreich abgespeichert!");
			return true;
		}
		return false;
	}
	public boolean auftraegeSpeichern () {
		
		try {
			FileOutputStream auftraegeSpeicher = new FileOutputStream ("auftraege");
			System.out.println("FileOutputStream erstellt");
			ObjectOutputStream o = new ObjectOutputStream (auftraegeSpeicher);
			System.out.println("ObjectOutputStream erstellt");
			o.writeObject(auftraege);
			System.out.println("Listenreferenz abgespeichert");
			for (int i = 0; i < auftraege.size(); i++) {
				o.writeObject(auftraege.get(i));
				System.out.println("Listenelement abgespeichert, Schritt "+i+" von"+auftraege.size());
			}
			auftraegeSpeicher.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		return true;
	}
}
