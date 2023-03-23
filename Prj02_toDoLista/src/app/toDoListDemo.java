package app;

import java.util.Scanner;

public class toDoListDemo {

	public static void main(String[] args) {
		
		int risposta = chiediIntero();
		toDoList listaSpesa= new toDoList(3);
		
		String cosaDaFare = chiediStringa();
		
		listaSpesa.addtoDo(cosaDaFare, 0);
		
		listaSpesa.addtoDo(cosaDaFare, 1);
		cosaDaFare = chiediStringa();
		listaSpesa.addtoDo(cosaDaFare, 2);
		cosaDaFare = chiediStringa();
		System.out.println(listaSpesa.gettoDo(1));
		listaSpesa.gettoDo(1).stampa();
		
	}
	
	
	private static String chiediStringa() {
		
		System.out.println("Inserisci la lista della spesa");
		Scanner scanner = new Scanner(System.in);
		return scanner.nextLine();
	}


	static int chiediIntero() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserisci un intero");
		return scanner.nextInt();
	}

}
