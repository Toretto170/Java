package com.spadea.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spadea.entities.Viaggio;

public interface ViaggioDAO extends JpaRepository<Viaggio, Integer> {
	
}
