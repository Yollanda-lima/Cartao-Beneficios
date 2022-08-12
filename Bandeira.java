
public enum Bandeira {
	STANDARD(0),
	PREMIUM(90),
	GOLD(130),
	PLATINUM(220),
	DIAMOND(250);
	
	private double preco;
	
	private Bandeira(double preco) {
		this.preco = preco;
	}
	
	public double preco() {
		return this.preco;
	}
}
