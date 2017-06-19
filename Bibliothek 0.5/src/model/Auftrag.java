package model;

public class Auftrag {
	
	int id = 0;
	Entleiher entleiher;
	Buch buch;
	String rueckgabedatum;
	
	public Auftrag (Buch buch, Entleiher entleiher, String rueckgabedatum) {
		this.buch = buch;
		this.entleiher = entleiher;
		this.rueckgabedatum = rueckgabedatum;
	}
	
	public boolean setID (int id) {
		if (id > 0) {
			this.id = id;
			System.out.println("Neue ID gesetzt");
			return true;
		}
		System.out.println("Id muss grösser als 0 sein!");
		return false;
	}
}