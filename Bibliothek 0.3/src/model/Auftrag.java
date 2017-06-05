package model;

public class Auftrag {
	
	Entleiher entleiher;
	Buch buch;
	int id = 0;
	String rueckgabedatum;
	
	public Auftrag (Buch buch, Entleiher entleiher, String rückgabedatum) {
		this.buch = buch;
		this.entleiher = entleiher;
		this.rueckgabedatum = rückgabedatum;
	}
}