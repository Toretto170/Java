package repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Connessione {

	private final String URL ="jdbc:mysql://localhost:3306/csv_db 9";
	private final String USER ="root";
	private final String PASS ="";
	
	private Connection conn; 
	
	public Connection getConn() {
		
		if (this.conn==null) {
			this.connetti();
		}
		
		return this.conn;
	}
	
	private void connetti() {
		
		try {
			this.conn = DriverManager.getConnection(URL, USER, PASS);
			System.out.println("Siamo Connessi");
		} catch (SQLException e) {
			System.err.println("Si è verificato un errore "+ e.getMessage());
		}
		
	}
}
