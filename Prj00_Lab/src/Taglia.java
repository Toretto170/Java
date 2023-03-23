
public enum Taglia {

	S(46),M(48),L(50);
	
	double misuraReale;
	private Taglia(double misuraReale) {
		this.misuraReale= misuraReale;
	}
	public double getMisuraReale() {
		return misuraReale;
	}
	
}
