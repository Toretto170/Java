package com.spadea.integration;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spadea.entities.Provincia;
import com.spadea.services.ProviciaService;

@RestController
@RequestMapping("api")
public class ControllerREST {

	@Autowired
	private ProviciaService service;
	
	@GetMapping("province")
	List<Provincia> getProvince(){
		return service.getProvince();
	}
	
	@GetMapping("province/{id}")
	Provincia getProvincia(@PathVariable int id) {
		return service.getProvinciaById(id);
	}
	
	@GetMapping("regioni")
	List<String> getRegioni(){
		return service.getRegioni();
	}
}
