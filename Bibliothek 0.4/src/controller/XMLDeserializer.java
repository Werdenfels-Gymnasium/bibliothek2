package controller;

import java.beans.XMLDecoder;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;

import model.*;

public class XMLDeserializer {
	@SuppressWarnings("unchecked")
	public LinkedList<Auftrag> auftraege () {
		LinkedList <Auftrag> lst = null;
		XMLDecoder decoder;
		try {
			decoder = new XMLDecoder (new FileInputStream ("auftraege.xml"));
			lst = (LinkedList<Auftrag>) decoder.readObject();
			decoder.close();
		} catch (FileNotFoundException e) {
			System.out.println("FIle existiert nicht!");
			e.printStackTrace();
		}
		System.out.println("Auftraege Liste wird zurückgegeben");
		return lst;
	}
}