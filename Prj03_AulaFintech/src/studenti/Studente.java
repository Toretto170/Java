package studenti;

public class Studente { //Studente ha 3 proprietà che lo caratterizzano non li diamo un valore
	
	int id;
	String nome;
	String cognome;
	
	public Studente(int id, String nome, String cognome) {
		this.id = id;
		this.nome = nome;
		this.cognome = cognome;
		System.out.println("Costruito lo Studente" + nome);
	}
}