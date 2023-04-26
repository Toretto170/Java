package com.spadea.services;

import java.util.List;

import com.spadea.entities.Prenotazione;
import com.spadea.entities.Viaggio;

public interface ViaggiService {
	
	List<Viaggio> getViaggi();
	Viaggio getViaggioById(int id);
	Viaggio addViaggio(Viaggio v);
	
	
	
	List<Prenotazione> getPrenotazioni();
	Prenotazione getPrenotazioneById(int id);
	Prenotazione addPrenotazione(Prenotazione p);
	Prenotazione updatePrenotazione(Prenotazione p);
	void deletePrenotazione(Prenotazione p);
}
