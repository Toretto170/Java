package com.spadea.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spadea.entities.ContoCorrente;

public interface ContoCorrenteDAO extends JpaRepository<ContoCorrente, Long> {

}
