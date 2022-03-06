package tests.builders;

import main.entities.Pagamento;
import main.enums.Credor;
import main.enums.TipoPagamento;

public class PagamentoBuilder {

	private Pagamento pagamento;
	
	public static PagamentoBuilder mockPagamento() {
		PagamentoBuilder builder = new PagamentoBuilder();
		builder.pagamento = new Pagamento(TipoPagamento.DOACAO, Credor.ALUNO, new Double(10), "pagamento");
		
		return builder;
	}
	
	public Pagamento getPagamento() {
		return this.pagamento;
	}
}
