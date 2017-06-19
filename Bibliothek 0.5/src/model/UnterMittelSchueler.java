package model;

public class UnterMittelSchueler extends Entleiher {
	String vorname;
	String nachname;
	String gebDat;
	UnterMittelStufe klasse;
	int zweig;
	int religion;
	
	
	public UnterMittelSchueler (String vorname, String nachname, String geburtsDatum, UnterMittelStufe klasse, String zweig, String religion) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.gebDat = geburtsDatum;
		this.klasse = klasse;
		
		//Zweig festlegen
		
		if (zweig.compareToIgnoreCase("ntw") == 0) {
			this.zweig = 0;
		}
		if (zweig.compareToIgnoreCase("sprachlich") == 0 ) {
			this.zweig = 1;
		}
		else {
			System.out.println("Fehler! Zweig falsch geschrieben?!");
			this.zweig = 0;
		}
		
		//Religion festlegen
		
		if (religion.compareToIgnoreCase("katholisch") == 0) {
			this.religion = 0;
		}
		if (religion.compareToIgnoreCase("evangelsich") == 0) {
			this.religion = 1;
		}
		if (religion.compareToIgnoreCase("ethik") == 0) {
			this.religion = 2;
		}
		else {
			System.out.println("Fehler! Religion falsch geschrieben?!");
			this.religion = 0;
		}
	}
}
