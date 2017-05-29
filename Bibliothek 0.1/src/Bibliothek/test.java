package Bibliothek;

import java.sql.SQLException;

public class test {

	public static void main(String[] args) {
		SQLite test = new SQLite();
		try {
			try {
				test.initialise();
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
