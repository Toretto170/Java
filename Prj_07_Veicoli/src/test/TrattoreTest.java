package test;

import model.Trattore;
import model.Veicolo;

public class TrattoreTest {

	public static void main(String[] args) {
		Veicolo t1 = new Trattore();
		
		t1.setMarca("lamborghini");
		t1.setModello("Cingolato");
		t1.setPrezzo(500000.99);
		System.out.println(t1);
	}

}
