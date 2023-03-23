package model;
/* La classe Impiegato ha

    attributi di tipo string: nome, cognome, id;
    attributi di tipo int: anno di nascita e stipendio;
    i relativi metodi getter e setter di tutti. Il setter dell'attributo id però non prende in input il valore ma lo ottiene con il metodo creaID della classe Segreteria.
*/
public class Impiegato {
	// Stato Interno
	private String nome,cognome;
	private String id;
	private int anno_nascita,stipendio;
	// Stato Interno
	
	//metodo costruttore
	public Impiegato(String nome, String cognome, int anno_nascita) {
		this.nome = nome;
		this.cognome = cognome;
		this.anno_nascita = anno_nascita;
		this.stipendio = 0;
		this.id = Segreteria.creaID(nome, cognome, anno_nascita);
	}
	//metodo costruttore
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCognome() {
		return cognome;
	}
	public void setCognome(String cognome) {
		this.cognome = cognome;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getAnno_nascita() {
		return anno_nascita;
	}
	public void setAnno_nascita(int anno_nascita) {
		this.anno_nascita = anno_nascita;
	}
	public int getStipendio() {
		return stipendio;
	}
	public void setStipendio(int stipendio) {
		this.stipendio = stipendio;
	}

	@Override
	public String toString() {
		return "Impiegato [Nome=" + nome + ", Cognome=" + cognome + ", ID Impiegato=" + id + "]";
	}
	
}
