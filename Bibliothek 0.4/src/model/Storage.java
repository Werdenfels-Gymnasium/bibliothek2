package model;
import java.util.LinkedList;

import javax.swing.JTable;
import javax.swing.table.TableColumn;

import java.io.*;
import controller.*;

public class Storage {	
	
	//Alles in Listen abspeichern
	public LinkedList<Auftrag> auftraege;
	public LinkedList<Buch> buecher;
	//Arten von Entleihern
	public LinkedList<UnterMittelSchueler> unterMittelSchuelerListe;
	public LinkedList<Lehrer> lehrerListe;
	//Klassen und Kurse
	public LinkedList<UnterMittelStufe> unterMittelStufeListe;
	public LinkedList<Einzelperson> einzelpersonen;
	public LinkedList<Einzelausleihe> einzelausleihe;
	
	
	public Storage () {
	}
	
	public void erststart () {
		auftraege = new LinkedList<Auftrag>();
		System.out.println("Auftragsliste erstellt!");
		buecher = new LinkedList<Buch>();
		System.out.println("Buchliste erstellt!");
		unterMittelSchuelerListe = new LinkedList<UnterMittelSchueler>();
		System.out.println("Schuelerliste (Unter- & Mittelstufe) erstellt!");
		lehrerListe = new LinkedList<Lehrer>();
		System.out.println("Lehrerliste erstellt!");
		unterMittelStufeListe = new LinkedList<UnterMittelStufe>();
		System.out.println("Klassenliste erstellt!");
		einzelpersonen = new LinkedList<Einzelperson>();
		System.out.ptintln("Einzelpersonenliste erstellt")
		einzelausleihe = new LinkedList<Einzelausleihe>();
		System.out.println("Einzelausleiheliste erstellen")
	}

	
	//Methode für die Liste Auftraege
	
	public Auftrag addAuftrag (Buch buch, Entleiher entleiher, String rueckgabedatum) {
		Auftrag neuerAuftrag = new Auftrag (buch, entleiher, rueckgabedatum);
		auftraege.add(neuerAuftrag);
		return neuerAuftrag;
	}
	
	public boolean deleteAuftragEntleiher (Entleiher entleiher, Buch buch) {
		int i = 0;
		while (i <= auftraege.size()) {
			if (auftraege.get(i).buch == buch && auftraege.get(i).entleiher == entleiher) {
				auftraege.remove(i);
				System.out.println("Element erfolgreich gelöscht!");
				return true;
			}
			else {
				i++;
			}
		}
		System.out.println("Element nicht gefunden!");
		return false;
	}
	
	public String rueckgabedatum (Entleiher entleiher, Buch buch) {
		int i = 0;
		while (i <= auftraege.size()) {
			if (auftraege.get(i).buch == buch && auftraege.get(i).entleiher == entleiher) {
				return auftraege.get(i).rueckgabedatum;
			}
			else {
				i++;
			}
		}
		return "Auftrag nicht gefunden";
	}

	//Methode für die Liste Klasse
	public UnterMittelStufe addKlasse (int jahrgangsstufe, int anzahl, char klasse, Lehrer lehrer) {
		UnterMittelStufe neueKlasse	= new UnterMittelStufe (jahrgangsstufe, anzahl, klasse, lehrer);
		unterMittelStufeListe.add(neueKlasse);
		System.out.println("Klasse "+jahrgangsstufe+klasse+" eingetragen");
		return neueKlasse;
	}

	//Methoden für die Liste UnterMittelSchueler
	public UnterMittelSchueler addUnterMittelSchueler (String vorname, String nachname, String gebdat, UnterMittelStufe klasse, String zweig, String religion) {
		UnterMittelSchueler neuerSchueler = new UnterMittelSchueler (vorname, nachname, gebdat, klasse, zweig, religion);
		unterMittelSchuelerListe.add(neuerSchueler);
		System.out.println("Neuer Schueler: "+vorname+" "+nachname+" eingetragen");
		return neuerSchueler;
	}
	
	public Buch searchBuchISBN (String iSBN) {
		for (int i = 0; i <= buecher.size(); i++) {
			if (iSBN.compareToIgnoreCase(buecher.get(i).iSBN) == 0) {
				Buch buch = buecher.get(i);
				return buch;
			}
		}
		return null;
	}
	
	public Buch deleteBuch (Buch buch) {
		buecher.remove(buch);
		return buch;
	}
	
	
	
	public Auftrag searchAuftragID (int id) {
		for (int i = 0; i <= auftraege.size(); i++) {
			if (id == auftraege.get(i).id) {
				Auftrag auftrag = auftraege.get(i);
				return auftrag;
			}
		}
		return null;
	}
	
	public Auftrag deleteAuftrag(Auftrag auftrag) {
		auftraege.remove(auftrag);
		return auftrag;
	}
	
	
	public Einzelperson searchEinzelpersonName (String vorname, String nachname) {
		for (int i = 0; i <= einzelpersonen.size(); i++) {
			if (vorname.compareToIgnoreCase(einzelpersonen.get(i).vorname) == 0 && nachname.compareToIgnoreCase(einzelpersonen.get(i).nachname) == 0)  {
				Einzelperson einzelperson = einzelpersonen.get(i);
				return einzelperson;
			}
		}
		return null;
	}
	
	public Einzelperson deleteEinzelperson(Einzelperson einzelperson) {
		einzelpersonen.remove(einzelperson);
		return einzelperson;
	}
	
	public UnterMittelSchueler searchUnterMittelSchuelerName (String vorname, String nachname) {
		for (int i = 0; i <= unterMittelSchuelerListe.size(); i++) {
			if (vorname.compareToIgnoreCase(unterMittelSchuelerListe.get(i).vorname) == 0 && nachname.compareToIgnoreCase(unterMittelSchuelerListe.get(i).nachname) == 0)  {
				UnterMittelSchueler unterMittelSchueler = unterMittelSchuelerListe.get(i);
				return unterMittelSchueler;
			}
		}
		return null;
	}
	
	public UnterMittelSchueler deleteUnterMittelSchueler(UnterMittelSchueler unterMittelSchueler) {
		unterMittelSchuelerListe.remove(unterMittelSchueler);
		return unterMittelSchueler;
	}
		
			
	public UnterMittelStufe searchUnterMittelStufeKlasse (int jahrgangsstufe, char klasse ) {
		for (int i = 0; i <= unterMittelStufeListe.size(); i++) {
			if (jahrgangsstufe == unterMittelStufeListe.get(i).jahrgangsstufe  && klasse == unterMittelStufeListe.get(i).klasse)  {
				UnterMittelStufe unterMittelStufe = unterMittelStufeListe.get(i);
				return unterMittelStufe;
			}
		}
		return null;
	}
	
	public UnterMittelStufe deleteUnterMittelStufe(UnterMittelStufe stufe) {
		unterMittelStufeListe.remove(stufe);
		return stufe;
	}
	
	
	public Lehrer searchLehrerName (String vorname, String nachname) {
		for (int i = 0; i <= lehrerListe.size(); i++) {
			if (vorname.compareToIgnoreCase(lehrerListe.get(i).vorname) == 0 && nachname.compareToIgnoreCase(lehrerListe.get(i).nachname) == 0)  {
				Lehrer lehrer = lehrerListe.get(i);
				return lehrer;
			}
		}
		return null;
	}
	
	public Lehrer deleteLehrer(Lehrer lehrer) {
		lehrerListe.remove(lehrer);

		return lehrer;
	}
	
	public JTable einzelpersonenAusgeben () {
		String [] [] rowData = new String [4] [einzelpersonen.size()];
		for (int i = 0; i < einzelpersonen.size(); i++) {
			Einzelperson einzelperson = einzelpersonen.get(i);
			rowData [0] [i] = einzelperson.vorname;
			rowData [1] [i] = einzelperson.nachname;
			rowData [2] [i] = einzelperson.adresse;
			rowData [3] [i] = einzelperson.telefonnummer;
		}
		String [] beschriftung = {
				"Vorname", "Nachname", "Adresse", "Telefonnummer"
		};
		return new JTable (rowData, beschriftung);
	}
			
					
	//Methoden fÃ¼r die Einzelausleihe
	public Einzelausleihe addEinzelausleihe (String vorname, String nachname, String adresse, String telefonnummer, int ISBN){
		Einzelperson e1 = new Einzelperson (vorname, nachname, adresse, telefonnummer);
		for (int i = 0; i <= buecher.size(); i++) {
			if (ISBN == buecher.get(i).iSBN)  {
				Buch b1 = buecher.get(i);
			}
			else {
				System.out.println("Buch mit der ISBN-Nummer "+ISBN+" nicht gefunden.");
			}
		}
		Einzelausleihe einzel1 = new Einzelausleihe (e1, b1);
		einzelausleihe.add (einzel1);
		return einzel1;
	}
	
	public Einzelausleihe deleteEinzelausleihe (String vorname, String nachname, int ISBN){
		for (int i = 0; i <= einzelausleihe.size(); i++) {
			if (vorname == einzelausleihe.get(i).vorname && nachname == einzelausleihe.get(i).nachname && ISBN == einzelausleihe.get(i).iSBN)  {
				Einzelausleihe einzel1 = einzelausleihe.get(i);
				einzelausleihe.remove(einzel1);
				return einzel1;
			}
		}
		return null;
	}
	
	public Einzelausleihe searchEinzelausleihe (String vorname, String nachname){
		for (int i = 0; i <= einzelausleihe.size(); i++){
			if (vorname.compareToIgnoreCase(einzelausleihe.get(i).vorname) == 0 && nachname.compareToIgnoreCase(einzelausleihe.get(i).nachname) == 0) {
				Einzelausleihe sEinzel = new einzelausleihe.get(i);
				return sEinzel;
			}
		}
	}
	
}
