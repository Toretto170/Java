package com.spadea.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spadea.entities.Glossario;
import com.spadea.entities.StandardPoors;
import com.spadea.service.GlossarioServices;

@RestController
public class ControllerRest {

	@Autowired
	private GlossarioServices service;
	
	@GetMapping("voci")
	public List<String> getVoci(){
		return service.getVoci();
	}
	
	@GetMapping("api/standard")
	public List<StandardPoors> getStandard(){
		return service.getStandardPoors();
	}
	@GetMapping("api/standard")
	public List<String> getSettori(){
		return service
				.getStandardPoors()
				.stream()
				.map(stand ->stand.getGICSSector())
				.distinct()
				.sorted()
				.toList();
	}
	@GetMapping("api/standard/{sector}")
	public List<StandardPoors> getStandardbySector(@PathVariable("sector")String sector){
		return service.getStandardPoorsbySector(sector);
	}
	@GetMapping("voce/{parola}")
	public Glossario getVoce(@PathVariable("parola")String voce) {
		return service.getByVoce(voce);
	}
	
	@PostMapping("voce/json")
	public Glossario addVoce(@RequestBody Glossario g) {
		 return service.addNuovaVoce(g);
	}
}
