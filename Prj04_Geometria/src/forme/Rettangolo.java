package forme;

public class Rettangolo {
	Segmento base,altezza;
	
	double perimetro;
	double area;
	public Rettangolo(Segmento base, Segmento altezza) {
		this.base = base;
		this.altezza = altezza;
		this.perimetro= calcolaPerimetro();
		this.area= calcolaArea();
	}
	private double calcolaArea() {
		
		return base.lunghezza*altezza.lunghezza;
	}
	private double calcolaPerimetro() {
		return 2*(base.lunghezza+altezza.lunghezza);
	}
	
	private double calcolaPerimetro(boolean b) {
		return(base.lunghezza+altezza.lunghezza+base.lunghezza+altezza.lunghezza);
	}
	@Override
	public String toString() {
		return "Rettangolo [base=" + base + ", altezza=" + altezza + ", perimetro=" + perimetro + ", area=" + area
				+ "]";
	}
	
	
}
