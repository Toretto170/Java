package database;

import java.util.ArrayList;
import java.util.Arrays;

import model.Impiegato;

public class DbImpiegati {
	static Impiegato[] arrayImpiegati = {
			new Impiegato("Alessandro","Bastianoni",1998),
			new Impiegato("Marco","Bausola",2004),
			new Impiegato("Marco","Bioletto",2003),
			new Impiegato("Paolo (Pietro)","Bruna",2000),
			new Impiegato("Sebastiano","Callà",2000),
			new Impiegato("Lorenzo","Cazzuola",2000),
			new Impiegato("Filippo","Congiu",2001),
			new Impiegato("Matteo","Costamagna",2001),
			new Impiegato("Leonardo","Diana",1995),
			new Impiegato("Umberto","Fiore",1993),
			
	};
	public static ArrayList<Impiegato> Impiegati = new ArrayList<>(Arrays.asList(arrayImpiegati));
}
