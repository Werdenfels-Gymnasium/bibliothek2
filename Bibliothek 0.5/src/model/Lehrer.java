package model;

public class Lehrer extends Entleiher {
	String vorname;
	String nachname;
	String kuerzel;
	int telefonnummer;
	
	public Lehrer (String vorname, String nachname, String kuerzel, int telefonnummer) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.kuerzel = kuerzel;
		this.telefonnummer = telefonnummer;
	}
}