package tests.mainTests;

import static org.junit.Assert.assertTrue;

import java.util.ArrayList;

import org.junit.Before;
import org.junit.Test;

import tests.builders.PagamentoBuilder;
import main.entities.Pagamento;
import main.BaseRepository;
import main.sectors.Financeiro;

public class FinanceiroTest {

    private Financeiro balanco;
    private BaseRepository<Pagamento> repositorio;
    private Pagamento pagamento;

    @Before
    public void setUp(){
        this.repositorio = new BaseRepository<Pagamento>(new ArrayList<Pagamento>());
        this.balanco = new Financeiro(this.repositorio);
        this.pagamento = PagamentoBuilder.mockPagamento().getPagamento();
    }
    @Test
    public void testGerarBalancoSemPedidos() {
        this.balanco.getRepository().save(this.pagamento);
        assertTrue(this.balanco.gerarBalancoSemPedidos() == new Double(10));
    }

}
