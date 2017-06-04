import java.io.*;

public class main {

	public static void main(String[] args) {
		File file = new File ("erststart.dat");
		if (file.isFile() && file.canWrite() && file.canRead()) {
			System.out.println("Dateiauslesung wird initialisiert");
		}
		else {
			System.out.println("Erststart wird ausgeführt! Dateien können verloren gehen!");
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			System.out.println("Erstart abgespeichert!");
		}
	}

}
