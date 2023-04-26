package com.spadea.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spadea.entities.Prenotazione;
import com.spadea.entities.Viaggio;
import com.spadea.services.ViaggiService;

@RestController
@RequestMapping("api")
public class ControllerRest {

	@Autowired
	private ViaggiService service;
	
	@GetMapping(value = {"viaggi","tratte"})
		List<Viaggio> getViaggi(){
		return service.getViaggi();
	}
	@GetMapping(value = {"prenotazioni","conferme"})
	List<Prenotazione> getPrenotazioni(){
		return service.getPrenotazioni();
	}
	
}
