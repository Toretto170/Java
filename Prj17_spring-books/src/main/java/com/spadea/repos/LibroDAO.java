package com.spadea.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spadea.entities.Libro;

public interface LibroDAO extends JpaRepository<Libro, Integer> {

}
