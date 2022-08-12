import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

class ClienteTest {

     Cliente client;
     IModalidadeCartao cartaoDebito;
     IModalidadeCartao cartaoCredito;

    @BeforeEach
    public void init(){
    	client = new Cliente("Puc", "15/06/2022");
    	cartaoDebito = new Debito();
    }

    @Test
    @Order(1)
    public void valorAnuidadePremiumContaBeneficioModalidadeDebito(){
        Cartao c = new ContaBeneficio(LocalDate.now(), Bandeira.PREMIUM);
        client.adicionarModalidade(cartaoDebito);
        client.addCartao(c);
        assertEquals(103.5, c.valorMensalidade, 0.1);
    }

    @Test
    @Order(2)
    public void valorAnuidade(){
        client.adicionarModalidade(cartaoDebito);
        assertEquals(40d, client.calcularAnuidade(10000), 0.1);
    } 

}
