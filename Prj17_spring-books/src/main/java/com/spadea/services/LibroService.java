package com.spadea.services;

import java.util.List;

import com.spadea.entities.Libro;

public interface LibroService {
	
	List<Libro> getLibri();
	Libro getLibrobyId(int id);
	
	Libro addLibro(Libro l);
	Libro updateLibro(Libro l);
	boolean deleteLibro(int id);
}
