package com.spadea.integration;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.spadea.entities.Bollettino;
import com.spadea.entities.ContoCorrente;
import com.spadea.services.BolPostService;

@RestController
@CrossOrigin(origins ="*")
public class ControllerREST {

	@Autowired
	private BolPostService service;
	
	@PostMapping("api/bollettino/add")
	public Bollettino addBollettino(@RequestBody Bollettino b) {
		return service.addBollettino(b);
	}
	
	@GetMapping("api/bollettino/{codicebol}")
	public Bollettino getBolbyCodiceBol(@PathVariable("codicebol") String codiceBollettino) {
		return service.getBollettinobyId(codiceBollettino);
		
	}
	
	@GetMapping("api/conticorrenti")
	public List<ContoCorrente> getContiCorrenti(){
		return service.getContiCorrenti();
	}
	@PostMapping("api/addcontocorrente")
	public ContoCorrente addContoCorrente(@RequestBody ContoCorrente c){
		return service.addContoCorrente(c);
	}
	@PostMapping("api/addconticorrenti")
	public List<ContoCorrente> addContiCorrenti(@RequestBody List<ContoCorrente> c){
		return service.addContiCorrenti(c);
	}
	@GetMapping("api/conticorrenti/{codiceConto}")
	public ResponseEntity<ContoCorrente> getContoCorrenteById(@PathVariable long codiceConto) {
		Optional<ContoCorrente> resource = service.getContoCorrentebyCodiceConto(codiceConto);
		if (resource.isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		ContoCorrente contoCorrente = resource.get();
		return ResponseEntity.ok(contoCorrente);
	}
 }
