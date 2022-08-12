import java.time.LocalDate;
import java.time.Period;
import java.util.HashMap;
import java.util.Map;

public class Cliente {

    public String nome;
    private Map<LocalDate, Cartao> cartoes;
    private IModalidadeCartao modalidade;
    private LocalDate dataContrato;
    
    public Cliente(String nome, String dataString){
        this.nome = nome;
        String[] dadosData = dataString.split("/");
        int dia = Integer.parseInt(dadosData[0]);
        int mes = Integer.parseInt(dadosData[1]);
        int ano = Integer.parseInt(dadosData[2]);
        
        this.dataContrato = LocalDate.of(ano, mes, dia);
        this.modalidade = null;
        this.cartoes = new HashMap<>();
    }

    private int periodoContrato(){
        return Period.between(this.dataContrato, LocalDate.now()).getYears();
    }
    
    public void addCartao(Cartao cartao) {
    	this.cartoes.put(dataContrato, cartao);
    }
    
    public double calcularMensalidade(Cartao cartao) {
    	return cartao.valorDaMensalidade();
    }
    
    public double calcularAnuidade(double gastos) {
    	return modalidade.calcularAnuidade(gastos);
    }
    
    public double valorAnuidade() {
    	return 0.0;
    }
    
    public void adicionarModalidade(IModalidadeCartao modalidade) {
    	this.modalidade = modalidade;
    }

    
}