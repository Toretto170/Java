package com.spadea;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.spadea.entities.Documento;
import com.spadea.entities.Viaggio;
import com.spadea.repo.DocumentoDAO;
import com.spadea.repo.ViaggioDAO;

@SpringBootApplication
public class Prj21AgenziaViaggiApplication {

	public static void main(String[] args) {
		SpringApplication.run(Prj21AgenziaViaggiApplication.class, args);
	}

//	@Bean
//	public CommandLineRunner test(ViaggioDAO dao, DocumentoDAO ddao) {
//		
//		return (a) ->{
//			Documento d = new Documento();
//			d.setNomeFile("Vaccinazioni richieste per il viaggio");
//			d.setPath("upload/vaccinazioni.pdf");
//			
//			Viaggio v = new Viaggio();
//			v.setNome("Cena Romantica a Lisbona");
//			v.setPrezzo(200);
//			v.setGiorni(3);
//			v.setDocumento(d);
//			ddao.save(d);
//			dao.save(v);
//		};
//		
//	}
}
