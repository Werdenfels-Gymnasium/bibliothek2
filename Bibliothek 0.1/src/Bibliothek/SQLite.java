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
			initialiseAuftrag();
			initialiseExterner();
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
			state2.executeQuery("Create Table buch (iSBN INTEGER PRIMARY KEY," + "zweig INTEGER," + "jahrgangsstufe INTEGER," + "titel varchar (60)," + "kurztitel varchar (20);");
			}
	}
	
	private void initialiseAuftrag() throws SQLException {
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name = 'auftrag'");
		
		if (!res.next()) {
			//Tabelle nicht vorhanden --> Muss erstellt werden
			Statement state2 = con.createStatement();
			state2.executeQuery("Create Table auftrag (auftragID INTEGER PRIMARY KEY AUTOINCREMENT," + "iSBN INTEGER);");
		}
	}
	
	private void initialiseEinzelperson() throws SQLException {

		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name = 'einzelperson'");
		
		if (!res.next()) {
			//Tabelle nicht vorhanden --> Muss erstellt werden
			Statement state2 = con.createStatement();
			state2.executeQuery("Create Table einzelperson (einzelpersonID INTEGER PRIMARY KEY AUTOINCREMENT," + "art VARCHAR (20));");
			}
	}
	
	private void initialiseExterner() throws SQLException {
		Statement state = con.createStatement();
		ResultSet res = state.executeQuery("SELECT name FROM sqlite_master WHERE type='table' AND name = 'externer'");
		
		if (!res.next()) {
			//Tabelle nicht vorhanden --> Muss erstellt werden
			Statement state2 = con.createStatement();
			state2.executeQuery("Create Table externer (einzelpersonID INTEGER PRIMARY KEY," + "nachname VARCHAR (20)," + "vorname VARCHAR (20)," + "postleitzahl INTEGER (10)," + "stadt VARCHAR (50)," + "telefonnummer INTEGER);");
			}
	}
	
}
