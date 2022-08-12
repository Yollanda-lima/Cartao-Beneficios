import java.time.LocalDate;

public class Conta extends Cartao {

	public Conta(LocalDate data, Bandeira espec) {
		super(data, espec);
	}

	@Override
	public double valorDaMensalidade() {
		
		return 0;
	}

}
