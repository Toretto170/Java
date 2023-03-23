package forme;

public class Segmento {
	
	Punto a,b;
	double lunghezza;
	
	public Segmento(Punto a, Punto b) {
		this.a = a;
		this.b = b;
		this.lunghezza = calcolaLunghezza();
	}

	public double calcolaLunghezza() {
		double l = 0;
		l = Math.sqrt(Math.pow(a.x-b.x, 2)+Math.pow(a.y-b.y, 2));
		return l;
	}

	@Override
	public String toString() {
		return "Segmento [a=" + a + ", b=" + b + ", lunghezza=" + lunghezza + "]";
	}
	
	
}
