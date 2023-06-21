package com.spadea.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spadea.entities.Bollettino;

public interface BollettinoDAO extends JpaRepository<Bollettino, String> {

	Bollettino findByCodiceBollettino(String codiceBollettino);
}
