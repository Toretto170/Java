package com.spadea;

import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.stereotype.Service;

import com.spadea.entities.Prenotazione;
import com.spadea.entities.Viaggio;
import com.spadea.services.ViaggiService;

@SpringBootTest
class Prj18SpringFlixBusApplicationTests {
	@Autowired
	private ViaggiService service;
	@Test
	void contextLoads() {
		Viaggio v = new Viaggio();
		v.setPartenza("Torino");
		v.setDestinazione("Firenze");
		v.setDurata(3);
		service.addViaggio(v);
		
		Prenotazione p = new Prenotazione();
		p.setData(LocalDate.now());
		p.setImporto(10);
		p.setNomeUtente("Alvise");
		p.setNumeroPosti(1);
		p.setViaggio(v);
		service.addPrenotazione(p);
	}

}
