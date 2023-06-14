package com.spadea;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.spadea.entities.Documento;
import com.spadea.entities.Viaggio;
import com.spadea.repo.DocumentoDAO;
import com.spadea.repo.ViaggioDAO;

@SpringBootTest
class Prj21AgenziaViaggiApplicationTests {

	@Autowired
	private DocumentoDAO ddao;
	
	@Autowired
	private ViaggioDAO vdao;
	
	
	@Test
	void caricaViaggi() {
		Viaggio v = new Viaggio();
		Documento d = new Documento();
		d.setNomeFile("Brochure Parigi");
		d.setPath("out/parigi.pdf");
		ddao.save(d);
		
		v.setNome("Una settimana a parigi");
		v.setGiorni(7);
		v.setPrezzo(800);
		v.setDocumento(d);
		
		vdao.save(v);
	}
	
	@Test
	void listaViaggi() {
	
		for (Viaggio v : vdao.findAll()) {
			System.out.println(v);
		}
	}

}
