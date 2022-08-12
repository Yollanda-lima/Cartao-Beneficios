import java.time.LocalDate;

public abstract class Cartao {
    protected LocalDate dataContrato;
    protected Bandeira categoria;
    protected double valorMensalidade;

    public Cartao(LocalDate data, Bandeira espec){
        this.dataContrato = data;
        this.categoria = espec;
        this.valorMensalidade=valorDaMensalidade();
    }
    public abstract double valorDaMensalidade();
    
}