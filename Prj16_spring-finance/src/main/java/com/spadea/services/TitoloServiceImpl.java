package com.spadea.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spadea.entities.Titolo;
import com.spadea.repos.TitoloDAO;

@Service
public class TitoloServiceImpl implements TitoloService {

	@Autowired
	private TitoloDAO dao;
	
	
	@Override
	public List<Titolo> getTitoli() {
		// TODO Auto-generated method stub
		return dao.findAll();
	}

	@Override
	public List<Titolo> getTitolibyRaccomandazioni(String raccomandazioni) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Titolo getTitolobyid(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Titolo addTitolo(Titolo t) {
		// TODO Auto-generated method stub
		return null;
	}

}
