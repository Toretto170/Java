package com.spadea.services;

import java.util.List;

import com.spadea.entities.Prenotazione;
import com.spadea.entities.Viaggio;

public interface FlixbusServices {

	Viaggio addViaggio(Viaggio v);
	List<Viaggio> getViaggi();
	
	Prenotazione addPrenotazione(Prenotazione p);
	List<Prenotazione> getPrenotazioni();
}
