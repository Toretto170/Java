package com.spadea.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spadea.entities.Prenotazione;
import com.spadea.entities.Viaggio;
import com.spadea.services.FlixbusServices;

@RestController
@RequestMapping("api")
public class ControllerREST {
	@Autowired
	private FlixbusServices service;
	
	@GetMapping("viaggi")
	List<Viaggio> getViaggio(){
		return service.getViaggi();
	}
	@GetMapping("prenotazioni")
	List<Prenotazione> getPrenotazioni(){
		return service.getPrenotazioni();
	}
	
	@PostMapping("viaggi")
	Viaggio addViaggio(@RequestBody Viaggio v) {
		return service.addViaggio(v);
	}
	@PostMapping("lista/viaggi")
	List<Viaggio> addViaggi(@RequestBody List<Viaggio> viaggi) {
		for (Viaggio viaggio : viaggi) {
			service.addViaggio(viaggio);
		}
		return service.getViaggi();
	}
	
	@PostMapping("prenotazioni")
	Prenotazione addPrenotazione(@RequestBody Prenotazione p) {
		return service.addPrenotazione(p);
	}
	
	
}
