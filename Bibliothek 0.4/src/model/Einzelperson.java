package model;

public class Einzelperson extends Entleiher {
	public String vorname;
	String nachname;
	String adresse;
	String telefonnummer;
	
	public Einzelperson () {
	}
	
	public Einzelperson setVorname (String vorname) {
		this.vorname = vorname;
		return this;
	}
	
	public Einzelperson setNachname (String nachname) {
		this.nachname = nachname;
		return this;
	}
	
	public Einzelperson setAdresse (String adresse) {
		this.adresse = adresse;
		return this;
	}

	
	public Einzelperson setTelefonnummer (String telefonnummer) {
		this.telefonnummer = telefonnummer;
		return this;
	}
	
	public Einzelperson set (String vorname, String nachname, String adresse, String telefonnummer) {
		this.vorname = vorname;
		this.nachname = nachname;
		this.adresse = adresse;
		this.telefonnummer = telefonnummer;
		return this;
	}
}