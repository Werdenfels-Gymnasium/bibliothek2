package model;

public class lehrer extends Entleiher {
	String vorname;
	String nachname;
	String kuerzel;
	int telefonnummer;
	
	public lehrer (String vorname, String nachname, String kuerzel, int telefonnummer) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.kuerzel = kuerzel;
		this.telefonnummer = telefonnummer;
	}
}
