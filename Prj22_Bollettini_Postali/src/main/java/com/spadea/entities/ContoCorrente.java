package com.spadea.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "conti_corrente")
public class ContoCorrente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long codiceConto;
	
	private String nomeIntestatario;

	public long getCodiceConto() {
		return codiceConto;
	}

	public void setCodiceConto(long codiceConto) {
		this.codiceConto = codiceConto;
	}

	public String getNomeIntestatario() {
		return nomeIntestatario;
	}

	public void setNomeIntestatario(String nomeIntestatario) {
		this.nomeIntestatario = nomeIntestatario;
	}
	
	
}
