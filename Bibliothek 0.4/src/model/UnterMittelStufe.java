package model;

public class UnterMittelStufe{
	int jahrgangsstufe;
	int anzahl;
	char klasse;
	Lehrer lehrer;
	
	public UnterMittelStufe (int jahrgangsstufe, int anzahl, char klasse, Lehrer lehrer) {
		this.jahrgangsstufe = jahrgangsstufe;
		this.anzahl = anzahl;
		this.klasse = klasse;
		this.lehrer = lehrer;
	}
	
	public int addAuftrag (Buch buch, Storage storage, String rueckgabedatum) {
		System.out.println("Klassensatz Buecher in Berarbeitung");
		if (buch.zweig == 1) {
			System.out.println("Bücher werden nur an Naturwissenschfatler verteilt!");
			System.out.println("Ausgabe wird initialisiert");
			int i = 0;
			int zaehler = 0;
			while (i <= storage.unterMittelSchueler.size()) {
				if (storage.unterMittelSchueler.get(i).klasse == this && storage.unterMittelSchueler.get(i).zweig == 1) {
					storage.addAuftrag(buch, storage.unterMittelSchueler.get(i), rueckgabedatum);
					zaehler++;
				}
			}
			return zaehler;
		}
		if (buch.zweig == 2) {
			System.out.println("Bücher werden nur an Sprachler verteilt!");
			System.out.println("Ausgabe wird initialisiert");
			int i = 0;
			int zaehler = 0;
			while (i <= storage.unterMittelSchueler.size()) {
				if (storage.unterMittelSchueler.get(i).klasse == this && storage.unterMittelSchueler.get(i).zweig == 2) {
					storage.addAuftrag(buch, storage.unterMittelSchueler.get(i), rueckgabedatum);
					zaehler++;
				}
			}
			return zaehler;
		}
		else {
			System.out.println("Bücher werden unabhängig vom Zweig verteilt");
			if (buch.fach.compareToIgnoreCase("katholisch") == 0) {
				System.out.println("Bücher werden nur an Katholiken vergeben");
				System.out.println("Ausgabe wird initialisiert");
				int i = 0;
				int zaehler = 0;
				while (i <= storage.unterMittelSchueler.size()) {
					if (storage.unterMittelSchueler.get(i).klasse == this && storage.unterMittelSchueler.get(i).religion == 1) {
						storage.addAuftrag(buch, storage.unterMittelSchueler.get(i), rueckgabedatum);
						zaehler++;
					}
				}
				return zaehler;
			}
			if (buch.fach.compareToIgnoreCase("evangelisch") == 0) {
				System.out.println("Bücher werden nur an evangelische Schüler ausgegeben");
				System.out.println("Ausgabe wird initialisiert");
				int i = 0;
				int zaehler = 0;
				while (i <= storage.unterMittelSchueler.size()) {
					if (storage.unterMittelSchueler.get(i).klasse == this && storage.unterMittelSchueler.get(i).religion == 1) {
						storage.addAuftrag(buch, storage.unterMittelSchueler.get(i), rueckgabedatum);
						zaehler++;
					}
				}
				return zaehler;
			}
			if (buch.fach.compareToIgnoreCase("ethik") == 0) {
				System.out.println("Bücher werden nur an Schüler aus Ethik verteilt");
				System.out.println("Ausgabe wird initialisiert");
				int i = 0;
				int zaehler = 0;
				while (i <= storage.unterMittelSchueler.size()) {
					if (storage.unterMittelSchueler.get(i).klasse == this && storage.unterMittelSchueler.get(i).religion == 2) {
						storage.addAuftrag(buch, storage.unterMittelSchueler.get(i), rueckgabedatum);
						zaehler++;
					}
				}
				return zaehler;
			}
			else {
				System.out.println("Jeder Schüler der Klasse bekommt das Buch");
				System.out.println("Ausgabe wird initialisiert");
				int i = 0;
				while (i <= anzahl) {
					if (storage.unterMittelSchueler.get(i).klasse == this) {
						storage.addAuftrag(buch, storage.unterMittelSchueler.get(i), rueckgabedatum);
					}
				}
			}
			return anzahl;
		}
	}
}
