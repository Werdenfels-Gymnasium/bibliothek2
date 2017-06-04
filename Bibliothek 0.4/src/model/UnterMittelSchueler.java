package model;

public class UnterMittelSchueler extends Entleiher {
	String vorname;
	String nachname;
	String gebDat;
	UnterMittelStufe klasse;
	
	
	public UnterMittelSchueler (String vorname, String nachname, String geburtsDatum, UnterMittelStufe klasse) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.gebDat = geburtsDatum;
		this.klasse = klasse;
	}
}
