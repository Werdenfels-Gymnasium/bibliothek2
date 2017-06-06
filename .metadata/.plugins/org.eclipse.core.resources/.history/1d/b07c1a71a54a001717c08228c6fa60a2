package controller;

import java.beans.XMLEncoder;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.LinkedList;
import model.*;

public class XMLSerializer {
	public XMLSerializer() {
		
	}
	
	public boolean auftraege (LinkedList<Auftrag> list) {
		try {
			File file = new File ("auftraege.xml");
			XMLEncoder encoder = new XMLEncoder (new FileOutputStream(file));
			encoder.writeObject(list);
			encoder.flush();
			encoder.close();
			System.out.println("Auftraege erfolgreich zwischen gespeichert");
			return true;
		}
		catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
		}
	}
}
