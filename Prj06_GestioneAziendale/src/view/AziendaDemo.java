package view;

import java.util.Iterator;
import java.util.Scanner;

import database.DbImpiegati;
import model.Azienda;
import model.Impiegato;

/* 
    Crea uno Scanner per prendere input da tastiera;
    Crea un oggetto azienda;
    Crea un tot di Impiegati chiedendo l'input da tastiera (usare un for);
    Aggiunge man mano questi impiegati all'azienda;
    Calcola e stampa lo stipendio totale.
*/
public class AziendaDemo {

	public static void main(String[] args) {
		Azienda a = new Azienda();
//		for(int c=0;c<5;c++) {
//			
//			String nome = leggiStringa("Inserisci il nome del impiegato: ");
//			String cognome = leggiStringa("Inserisci il cognome del impiegato: ");
//			int eta = leggiIntero("Inserisci eta impiegato");
//			
//			Impiegato i1 = new Impiegato(nome, cognome,eta);
//			a.addImpiegato(i1);
//			i1.setStipendio(1000);
//		}
		for (Impiegato i : DbImpiegati.Impiegati) {
			i.setStipendio(1000);
			a.addImpiegato(i);
		}	
			
		
		//System.out.println("Stipendio totale: " + a.stipendioTot());
		//System.out.println(i1);
		
		for (Impiegato i : a.getImpiegati()) {
			System.out.println(i);
		}
		
//		Impiegato i2 = a.getImpiegatoByID("MaRo1980");
//		i2.setStipendio(2000);
		System.out.println(a.stipendioTot());
	}

	private static int leggiIntero(String messaggio) {
		Scanner scanner = new Scanner(System.in);
		System.out.println(messaggio);
		
		return scanner.nextInt();
	}

	private static String leggiStringa(String messaggio) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println(messaggio);
		
		return scanner.nextLine();
	}

}
