package com.spadea.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bollettini")
public class Bollettino {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String codiceBollettino;
	private double importo;
	private String causale;
	private long codiceContoDestinatario;
	private String nomePagatore;
	private int numeroCarta;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getCodiceBollettino() {
		return codiceBollettino;
	}
	public void setCodiceBollettino(String codiceBollettino) {
		this.codiceBollettino = codiceBollettino;
	}
	public double getImporto() {
		return importo;
	}
	public void setImporto(double importo) {
		this.importo = importo;
	}
	public String getCausale() {
		return causale;
	}
	public void setCausale(String causale) {
		this.causale = causale;
	}
	public long getCodiceContoDestinatario() {
		return codiceContoDestinatario;
	}
	public void setCodiceContoDestinatario(long codiceContoDestinatario) {
		this.codiceContoDestinatario = codiceContoDestinatario;
	}
	public String getNomePagatore() {
		return nomePagatore;
	}
	public void setNomePagatore(String nomePagatore) {
		this.nomePagatore = nomePagatore;
	}
	public int getNumeroCarta() {
		return numeroCarta;
	}
	public void setNumeroCarta(int numeroCarta) {
		this.numeroCarta = numeroCarta;
	}
	
	
}
