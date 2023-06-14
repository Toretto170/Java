package provaInput;

import java.io.BufferedReader;
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner; // Import the Scanner class to read text files

public class ReadFile {
  public static void main(String[] args) {
	  BufferedReader reader;
	  List<String> lstr = new ArrayList<>();
		try {
			reader = new BufferedReader(new FileReader("C:\\Users\\icts22-24.083\\Desktop\\leggereJava.txt"));
			String line = reader.readLine();
			lstr.add(line);
			while (line != null) {
				//System.out.println(line);
				// read next line
				line = reader.readLine();
				lstr.add(line);
			}

			reader.close();
			System.out.println(lstr);
		} catch (IOException e) {
			e.printStackTrace();
		}
	 }
}
