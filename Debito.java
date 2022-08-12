
public class Debito implements IModalidadeCartao{

	
	public final double ANUIDADE = 40;
	public final double TDM = 0;
	
	
	public Debito() {
		
	}
	
	@Override
	public double calcularAnuidade(double gastos) {
		double marcaGastos = 12000;
		double anuidadeAcum = ANUIDADE;
		
		if(gastos > marcaGastos) {
			for(int i = 0; i >= marcaGastos ; i++) {
				anuidadeAcum += ANUIDADE * 0.5;
			}
		}
		return anuidadeAcum;
	}

	@Override
	public double tdm() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
