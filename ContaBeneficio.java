import java.time.LocalDate;

public class ContaBeneficio extends Cartao {
	
	public final double TARIFA = 0.15;

	public ContaBeneficio(LocalDate data, Bandeira espec) {
		super(data, espec);
	}

	@Override
	public double valorDaMensalidade() {
		
		return this.categoria.preco() * (1 + TARIFA);
	}

}
