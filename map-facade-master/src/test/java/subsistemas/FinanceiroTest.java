package subsistemas;

import entidades.Entrevista;
import entidades.Pagamento;
import entidades.Reuniao;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

public class FinanceiroTest {

    private Financeiro financeiro;

    @BeforeEach
    public void setup() {
        this.financeiro = new Financeiro();
    }

    @Test
    public void folhaDePagamentoEncontradaComSucesso() {
        Pagamento pagamento = this.financeiro.getFolhaDePagamentoPeloId("01");
        Assertions.assertEquals("01", pagamento.getId());

        this.folhaDePagamentoEstaComOValorCorreto(pagamento);
    }

    public void folhaDePagamentoEstaComOValorCorreto(Pagamento pagamento) {
        Assertions.assertEquals(1400.00, pagamento.getValor());
    }

    @Test
    public void balancoRealizadoComSucesso() {
        double valor = this.financeiro.getBalancoDeContas();
        Assertions.assertEquals(8100.00, valor);
    }
}
