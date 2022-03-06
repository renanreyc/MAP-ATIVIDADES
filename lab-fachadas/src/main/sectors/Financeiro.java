package main.sectors;

import main.entities.Pagamento;
import main.entities.Pedido;
import main.entities.Professor;
import main.enums.Credor;
import main.enums.TipoPagamento;
import main.BaseRepository;

import java.util.ArrayList;
import java.util.List;

public class Financeiro {

    private BaseRepository<Pagamento> repository;

    public Financeiro(BaseRepository<Pagamento> repository) {
        this.repository = repository;
    }

    public double gerarBalancoSemPedidos() {

        double total = 0;
        for (Pagamento pagamento : this.repository.getAll()) {
            if (pagamento.getTipo().equals(TipoPagamento.MATRICULA) || pagamento.getTipo().equals(TipoPagamento.DOACAO))
                total += pagamento.getValor();
            else
                total -= pagamento.getValor();
        }

        return total;
    }

    public double gerarBalnacoComPedidos(List<Pedido> pedidos) {
        double total = this.gerarBalancoSemPedidos();
        for (Pedido pedido : pedidos)
            total -= pedido.getValor();

        return total;
    }

    public Pagamento pagar(double valor, Credor credor, TipoPagamento tipo, String nome) {
        Pagamento pagamento = new Pagamento(tipo, credor, valor, nome);
        return this.repository.save(pagamento);
    }

    public List<Pagamento> gerarFolhaDePagamento(List<Professor> professores) {

        List<Pagamento> pagamentos = new ArrayList<>();

        for (Professor professor : professores) {
            Pagamento pagamento = new Pagamento(TipoPagamento.SALARIO, Credor.PROFESSOR, professor.getSalario(), professor.getNome());
            pagamentos.add(pagamento);
        }

        return pagamentos;
    }

    public BaseRepository<Pagamento> getRepository() {
        return repository;
    }
}
