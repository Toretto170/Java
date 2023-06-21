package com.spadea.integration;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spadea.entities.Bollettino;
import com.spadea.entities.ContoCorrente;
import com.spadea.services.BolPostService;

@RestController
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
	public Optional<ContoCorrente> getContoCorrenteById(@PathVariable long codiceConto) {
		return service.getContoCorrentebyCodiceConto(codiceConto);
	}
 }
