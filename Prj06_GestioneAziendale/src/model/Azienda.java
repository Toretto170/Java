package model;
/* 
 La classe Azienda conserva il riferimento a tutti gli impiegati e può calcolare lo stipendio totali di tutti essi. Quindi ha come attributo:

    un array di Impiegati;
    numero massimo di impiegati;
    numero attuale di impiegati. Ha come metodi:
    un metodo addImpiegato( ... ): aggiunge un impiegato all'array (se non è già pieno);
    un metodo stipendioTOT( ): calcola lo stipendio totale come somma di tutti gli stipendi.

 */

import java.util.ArrayList;

public class Azienda {
	private ArrayList<Impiegato> impiegati;
	
	public Azienda() {
		impiegati = new ArrayList<>();
	}
	
	public void addImpiegato(String nome, String cognome,int anno_nascita) {
		Impiegato i = new Impiegato(nome, cognome, anno_nascita);
		impiegati.add(i);
	}
	
	public void addImpiegato(Impiegato i) {
		impiegati.add(i);
	}
	public int stipendioTot() {
		int totale = 0;
		for (Impiegato impiegato : impiegati) {
			totale += impiegato.getStipendio();
		}
		return totale;
	}
	public ArrayList<Impiegato> getImpiegati(){
		
		return impiegati;
	}
	
	public Impiegato getImpiegatoByID(String id) {
		for (Impiegato impiegato : impiegati) {
			if (impiegato.getId().equals(id)) {
				return impiegato;
			}
		}
		return null;
	}
}
