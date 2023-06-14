import java.io.BufferedInputStream;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;

public class DemoFile {

	public static void main(String[] args) {
		URL mioUrl = new URL("");
		
		InputStream openStream = mioUrl.openStream();
		
		BufferedInputStream bis = new BufferedInputStream(openStream);
		
		int i;
		
		while(i=bis.read()!=-1) {
			
		}
		

	}

}
