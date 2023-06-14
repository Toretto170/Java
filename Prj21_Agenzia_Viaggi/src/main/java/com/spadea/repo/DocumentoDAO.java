package com.spadea.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spadea.entities.Documento;

public interface DocumentoDAO extends JpaRepository<Documento, Integer> {

}
