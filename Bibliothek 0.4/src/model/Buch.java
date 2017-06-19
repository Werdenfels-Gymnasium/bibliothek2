package model;

public class Buch {
	int iSBN;
	String titel;
	String kurztitel;
	int jahrgangsstufe;
	String fach;
	int zweig;

	public Buch (int iSBN, String titel, String kurztitel, int jahrgangsstufe, String fach, String zweig) {
		this.iSBN = iSBN;
		this.titel = titel;
		this.kurztitel = kurztitel;
		this.jahrgangsstufe = jahrgangsstufe;
		this.fach = fach;
		if (zweig.compareToIgnoreCase("nut") == 0) {
			this.zweig = 1;
		}
		if (zweig.compareToIgnoreCase("sprachlich") == 0) {
			this.zweig = 2;
		}
		else {
			System.out.println("Kein Zweig stimmt überein --> Für beide zulässig");
			this.zweig = 0;
		}
	}
}
