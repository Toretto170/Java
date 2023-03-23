package view;

import controller.Rubrica;
import model.Contatto;

public class RubricaDemo {

	public static void main(String[] args) {
		Rubrica rubrica1 = new Rubrica("Agenda Rossa",4);
		
		Rubrica rubrica2 = new Rubrica("Agenda Blu", 6);
		
		System.out.println(rubrica1);
		
		rubrica1.addContatto("umberto","0123456", 0);
		rubrica1.addContatto("marco","1265484984", 1);
		System.out.println(rubrica1);
		Contatto c1= new Contatto("Andrea");
		rubrica1.addContatto(c1, 2);
		System.out.println(rubrica1);
	}

}
