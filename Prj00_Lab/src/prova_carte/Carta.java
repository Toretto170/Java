package prova_carte;

public class Carta {
	
	private String valore;
	private String seme;
	public Carta(String valore, String seme) {
		this.valore = valore;
		this.seme = seme;
	}
	
	
	public String getValore() {
		return valore;
	}


	public String getSeme() {
		return seme;
	}


	@Override
	public String toString() {
		return "Carta [valore=" + valore + ", seme=" + seme + "]";
	}
	
	
	
	
}
