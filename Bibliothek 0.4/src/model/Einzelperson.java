package model;

public class Einzelperson extends Entleiher {
	String vorname;
	String nachname;
	String adresse;
	int telefonnummer;
	
	public Einzelperson (String vorname, String nachname, String adresse, int telefonnummer) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.adresse = adresse;
		this.telefonnummer = telefonnummer;
	}
	
	public void setAdresse (String neueAdresse) {
		adresse = neueAdresse;
	}
}
