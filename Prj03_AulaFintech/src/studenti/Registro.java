package studenti;

import java.util.ArrayList;

public class Registro { //Contenitore di studenti + altre propriete oltre a contenere studenti
	
	String nome;
	ArrayList<Studente> elenco;
	/**
	 * Costruttore del registro
	 * @param nome passare come parametro il nome del registro
	 */
	public Registro(String nome) { 
		this.nome = nome;
		this.elenco = new ArrayList<>();
	}
	
	public void addStudente(Studente s){
		elenco.add(s);
	}
	
	public void addStudente(int id, String nome,String cognome) {
		Studente s = new Studente(id,nome,cognome);
		elenco.add(s);
	}
	
	public void appello() {
		
		for (Studente s : elenco) {
			System.out.println(s.nome.toUpperCase() + " " + s.cognome);
		}
		
	}
}
