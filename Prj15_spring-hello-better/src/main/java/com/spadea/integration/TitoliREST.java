package com.spadea.integration;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spadea.controller.Portafoglio;
import com.spadea.model.Titolo;

@RestController
@RequestMapping("api")
public class TitoliREST {
	
	private Portafoglio service = new Portafoglio();
	
	@GetMapping("titoli")
	public List<Titolo> getTitoli(){
		
		service.addTitolo("Fiat", 50);
		service.addTitolo("Ferrari",150);
		service.addTitolo("Maserati",250);
		service.addTitolo("Lambo", 350);
		service.addTitolo("Lancia", 450);
		service.addTitolo("Autobianchi",550);
		
		return service.getTitoli();
		
	}
	
	@PostMapping("titoli")
	public Titolo addTitolo(@RequestBody Titolo t) {
		
		service.addTitolo(t);
		
		return t;
	}
	
}
