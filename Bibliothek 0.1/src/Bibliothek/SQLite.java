package Bibliothek;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLite {
	
	private static Connection con;
	private static boolean hasData = false;
	
	private void getConnection() throws ClassNotFoundException, SQLException {
		Class.forName("org.sqlite.JDBC");
		con = DriverManager.getConnection("jdbc:sqlite:SQLiteBibliothek.db");
		initialise();
	}

	private void initialise() throws SQLException {
		if (!hasData) {
			hasData = true;
			initialiseBuch();
			initialiseEinzelperson();
			initialiseAusleihe();
			initialiseEntleiher();
			initialiseUnterMittelstufenschüler();
			initialiseEntleiherstandort();
			initialiseKurs();
			initialiseOberstufenschüler();
			initialiseKlasse();
			
			}
		}
	
	
	private void initialiseBuch() throws SQLException {
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name = 'buch'");
		
		if (!res.next()) {
			//Tabelle nicht vorhanden --> Muss erstellt werden
			Statement state2 = con.createStatement();
			//int Zweig
			//0 beide
			//1 NW
			//2 SG
			state2.executeQuery("Create Table buch (titel VARCHAR (60)," + "kurztitel VARCHAR (20)," + "fach VARCHAR (20)," + "jahrgangsstufe INTEGER," + "iSBN INTEGER PRIMARY KEY," + "zweig INTEGER,");
			}
	}
	
	private void initialiseAusleihe() throws SQLException {
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name = 'ausleihe'");
		
		if (!res.next()) {
			//Tabelle nicht vorhanden --> Muss erstellt werden
			Statement state2 = con.createStatement();
			state2.executeQuery("Create Table auftrag (IDausleihe INTEGER PRIMARY KEY AUTOINCREMENT," + "iSBN INTEGER," + "IDentleiher INTEGER," + "abgabedatum  VARCHAR(15));");
			//ISBN und IDentleiher als Fremdschlüssel
		}
	}
	
	private void initialiseEntleiher() throws SQLException {

		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name = 'entleiher'");
		
		if (!res.next()) {
			//Tabelle nicht vorhanden --> Muss erstellt werden
			Statement state2 = con.createStatement();
			state2.executeQuery("Create Table entleiher (IDentleiher INTEGER PRIMARY KEY AUTOINCREMENT," + "art VARCHAR (20));");
			}
	}
	
	private void initialiseEinzelperson() throws SQLException {
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name = 'einzelperson'");
		
		if (!res.next()) {
			//Tabelle nicht vorhanden --> Muss erstellt werden
			Statement state2 = con.createStatement();
			state2.executeQuery("Create Table einzelperson (IDentleiher INTEGER PRIMARY KEY," + "nachname VARCHAR (20)," + "vorname VARCHAR (20)," + "adresse VARCHAR (80)," + "telefonnummer INTEGER);");
			}
	}
	
	private void initialiseUnterMittelstufenschüler() throws SQLException {
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name = 'untermittelstufenschüler'");
		
		if (!res.next()) {
			//Tabelle nicht vorhanden --> Muss erstellt werden
			Statement state2 = con.createStatement();
			state2.executeQuery("Create Table einzelperson (IDentleiher INTEGER PRIMARY KEY," + "nachname VARCHAR (20)," + "vorname VARCHAR (20)," + "abiturjahrgang INTEGER," + "IDklasse INTEGER);");
			//IDklasse als Fremdschlüssel
			}
	}
	
	private void initialiseEntleiherstandort() throws SQLException {
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name = 'entleiherstandort'");
		
		if (!res.next()) {
			//Tabelle nicht vorhanden --> Muss erstellt werden
			Statement state2 = con.createStatement();
			state2.executeQuery("Create Table einzelperson (IDentleiher INTEGER PRIMARY KEY," + "standort varchar(30);");
			}
	}
	
	private void initialiseKurs() throws SQLException {
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name = 'kurs'");
		
		if (!res.next()) {
			//Tabelle nicht vorhanden --> Muss erstellt werden
			Statement state2 = con.createStatement();
			state2.executeQuery("Create Table einzelperson (IDkurs INTEGER PRIMARY KEY," + "anzahl INTEGER);");
			}
	}
	
	private void initialiseOberstufenschüler() throws SQLException {
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name = 'oberstufenschüler'");
		
		if (!res.next()) {
			//Tabelle nicht vorhanden --> Muss erstellt werden
			Statement state2 = con.createStatement();
			state2.executeQuery("Create Table einzelperson (IDentleiher INTEGER PRIMARY KEY," + "nachname VARCHAR (20)," + "vorname VARCHAR (20)," + "abiturjahrgang INTEGER," + "IDkurs INTEGER);");
			//IDkurs als Fremdschlüssel
			}
	}
	
	private void initialiseKlasse() throws SQLException {
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name = 'klasse'");
		
		if (!res.next()) {
			//Tabelle nicht vorhanden --> Muss erstellt werden
			Statement state2 = con.createStatement();
			state2.executeQuery("Create Table einzelperson (IDklasse INTEGER PRIMARY KEY," + "anzahl INTEGER);");
			}
	}
}
