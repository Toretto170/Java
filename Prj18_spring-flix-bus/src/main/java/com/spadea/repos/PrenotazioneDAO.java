package com.spadea.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spadea.entities.Prenotazione;

public interface PrenotazioneDAO extends JpaRepository<Prenotazione, Integer> {

}
