package controller;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import model.*;

public class XMLDeserializer {
	
	public Storage laden () {
		Storage storage = null;
		XMLDecoder decoder;
		try {
			decoder = new XMLDecoder (new FileInputStream ("storage.xml"));
			storage = (Storage) decoder.readObject();
			decoder.close();
		} catch (FileNotFoundException e) {
			System.out.println("FIle existiert nicht!");
			e.printStackTrace();
		}
		System.out.println("Auftraege Liste wird zurückgegeben");
		return storage;
	}
}