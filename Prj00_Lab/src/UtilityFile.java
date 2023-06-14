import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

class Glossario{
	 
	String voce;
	String desc;
	String link;
	public Glossario(String voce, String desc, String link) {
		super();
		this.voce = voce;
		this.desc = desc;
		this.link = link;
	}
	
	
}


public class UtilityFile {

	public static void main(String[] args) {
		
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost//fintech", "root", "");
		
		PreparedStatement ps;


		List<String> readAllLines = Files.readAllLines(Paths.get(), Charset.forName("utf-8"));
		
		readAllLines.forEach(riga -> {
			String[] split = riga.split("\\|");
			String voce = split[0];
			String desc = split[1];
			String link = split[2];
			
			Glossario g = new Glossario(voce, desc, link);
			
			ps = conn.prepareStatement("insert into voci_finanziarie (voce, descrizione, collegamento) value () (?,?,?)");
			ps.setString(1, voce);
			ps.setString(2, desc);
			ps.setString(3, link);
			
			ps.execute();
		});
		
		

	}

}
