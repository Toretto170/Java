package test;

import java.util.ArrayList;
import java.util.List;

import model.Automobile;
import model.Trattore;
import model.Veicolo;

public class SaloneVeicoli {

	public static void main(String[] args) {
		List<Veicolo> veicoli = new ArrayList<>();
		
		veicoli.add(new Automobile("Ferrari"));
		veicoli.add(new Trattore());
		veicoli.add(new Automobile("Lambo"));
		
		System.out.println(veicoli.size());
		
		for (Veicolo veicolo : veicoli) {
			System.out.println(veicolo);
		}
	}

}
