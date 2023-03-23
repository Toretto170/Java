package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {
	private final String URL = "jdbc:mysql:||localhost:3306|impiegati";
	private final String USER = "root";
	private final String PW = "";
	
	private Connection conn= null;
	
	public void connetti() {
		try {
			this.conn=DriverManager.getConnection(URL, USER, PW);
			System.out.println("Connessione Riuscita");
		} catch (SQLException e) {
			System.err.println("Connessione non riuscita per: "+ e.getMessage());
		}
		
	}
	public Connection getConn() (return conn;)
}
