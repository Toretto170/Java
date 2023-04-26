package com.spadea.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spadea.entities.Prenotazione;
import com.spadea.entities.Viaggio;
import com.spadea.repo.PrenotazioneDAO;
import com.spadea.repo.ViaggioDAO;

@Service
public class FlixbusServiceImpl implements FlixbusServices {

	@Autowired
	private ViaggioDAO viaggiodao;
	@Autowired
	private PrenotazioneDAO prenotazionedao;
	@Override
	public Viaggio addViaggio(Viaggio v) {
		// TODO Auto-generated method stub
		return viaggiodao.save(v);
	}

	@Override
	public List<Viaggio> getViaggi() {
		// TODO Auto-generated method stub
		return viaggiodao.findAll();
	}

	@Override
	public Prenotazione addPrenotazione(Prenotazione p) {
		// TODO Auto-generated method stub
		return prenotazionedao.save(p);
	}

	@Override
	public List<Prenotazione> getPrenotazioni() {
		// TODO Auto-generated method stub
		return prenotazionedao.findAll();
	}

}
