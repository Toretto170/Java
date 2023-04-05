package com.spadea.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.spadea.model.Titolo;

@Component
public class Portafoglio {

	private List<Titolo> titoli = new ArrayList<>();
	
	public void addTitolo(Titolo t) {
		
		titoli.add(t);
	}
	
	public List<Titolo> getTitoli() {
		return titoli;
	}



	public void addTitolo(String nome, double prezzo) {
		
		Titolo t = new Titolo();
		t.setNome(nome);
		t.setValore(prezzo);
		titoli.add(t);
	}
	
	
}
