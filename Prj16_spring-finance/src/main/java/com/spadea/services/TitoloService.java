package com.spadea.services;

import java.util.List;

import com.spadea.entities.Titolo;

public interface TitoloService {

	
	List<Titolo> getTitoli();
	List<Titolo> getTitolibyRaccomandazioni(String raccomandazioni);
	
	Titolo getTitolobyid(int id);
	
	Titolo addTitolo(Titolo t);
}
