package model;

public class Contatto {
	private String nome;
	private String numero;
	
	public Contatto() { //Costruttore, non ritorna nulla. Lettera Maiuscola
		this.nome = nome;
		this.numero = "sconosciuto";
	}
	
	public Contatto(String nome, String numero) {
		this.nome = nome;
		this.numero = numero;
	}

	//Metodi Accessori, permettono di accedere alle proprietà. Getters e Setters
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "Contatto [nome=" + nome + ", numero=" + numero + "]";
	}
	
	
	
	
}
