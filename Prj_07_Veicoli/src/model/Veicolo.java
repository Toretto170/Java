package model;

public class Veicolo {
	
	// dichiarazione proprietà che sono comuni a tutti i veicoli
	// Stato Interno
	private static int counter = 1;
	private int id; // classi figlio non accedono a ID e non possono modificarlo
	protected String marca;  
	protected String modello; // marca modello e prezzo lo ereditano le classi figlio che estendono veicolo
	protected double prezzo;
	
	//metodi
	
	//costruttori
	public Veicolo() {
		this.id= counter++; // postincrementale prima assegna e poi aumenta
		System.out.println("veicolo generico costruito");
	}
	/**
	 * Costruttore del veicolo
	 * inserire marca del veicolo
	 * @param marca
	 */
	public Veicolo(String marca) {
		this.id= counter++;
		this.marca=marca;
		System.out.println("veicolo marchiato costruito "+"Marca: "+ marca);
	}
	
	// getters and setters accessori e mutatori
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca.toUpperCase();
	}
	public String getModello() {
		return modello;
	}
	public void setModello(String modello) {
		this.modello = modello;
	}
	public double getPrezzo() {
		return prezzo;
	}
	public void setPrezzo(double prezzo) {
		this.prezzo = prezzo;
	}
	
	@Override // sovrascrivo il metodo tostring precedente
	public String toString() {
		return "Veicolo [id=" + id + ", marca=" + marca + ", modello=" + modello + ", prezzo=" + prezzo
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	
	
	
	
}
