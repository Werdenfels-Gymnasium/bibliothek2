package model;
import java.util.LinkedList;
import java.io.*;
import controller.*;

public class Storage {	
	
	//Alles in Listen abspeichern
	public LinkedList<Auftrag> auftraege;
	public LinkedList<Buch> buecher;
	//Arten von Entleihern
	public LinkedList<UnterMittelSchueler> unterMittelSchueler;
	public LinkedList<Lehrer> lehrer;
	//Klassen und Kurse
	public LinkedList<UnterMittelStufe> unterMittelStufe;
	public LinkedList<Einzelperson> einzelpersonen;
	
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
		einzelpersonen = new LinkedList<Einzelperson>;
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
		unterMittelStufe.add(neueKlasse);
		System.out.println("Klasse "+jahrgangsstufe+klasse+" eingetragen");
		return neueKlasse;
	}

	//Methoden für die Liste UnterMittelSchueler
	public UnterMittelSchueler addUnterMittelSchueler (String vorname, String nachname, String gebdat, UnterMittelStufe klasse, String zweig, String religion) {
		UnterMittelSchueler neuerSchueler = new UnterMittelSchueler (vorname, nachname, gebdat, klasse, zweig, religion);
		unterMittelSchueler.add(neuerSchueler);
		System.out.println("Neuer Schueler: "+vorname+" "+nachname+" eingetragen");
		return neuerSchueler;
	}
	
	public Buch deleteBuchISBN (int iSBN) {
		for (int i = 0; i <= buecher.size(); i++) {
			if (iSBN == buecher.get(i).iSBN) {
				Buch buch = buecher.get(i);
				buecher.remove(i);
				return buch;
			}
		}
		return null;
	}
	
	public Auftrag deleteAuftragID (int id) {
		for (int i = 0; i <= auftraege.size(); i++) {
			if (id == auftraege.get(i).id) {
				Auftrag auftrag = auftraege.get(i);
				auftraege.remove(i);
				return auftrag;
			}
		}
		return null;
	}
	
	public Einzelperson deleteEinzelpersonName (String vorname, String nachname) {
		for (int i = 0; i <= einzelpersonen.size(); i++) {
			if (vorname.compareToIgnoreCase(einzelpersonen.get(i).vorname) == 0 && nachname.compareToIgnoreCase(einzelpersonen.get(i).nachname) == 0)  {
				Einzelperson einzelperson = einzelpersonen.get(i);
				auftraege.remove(i);
				return einzelperson;
			}
		}
		return null;
	}
	
	
	
	
}