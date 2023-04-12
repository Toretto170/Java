package com.spadea.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spadea.entities.Libro;
import com.spadea.services.LibroService;

@RestController
@RequestMapping("api")
public class LibriREST {
	
	@Autowired
	private LibroService service;
	
	@GetMapping("libri")
	public List<Libro> getLibri(){
		return service.getLibri();
	}
}
