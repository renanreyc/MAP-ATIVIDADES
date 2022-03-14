package subsistemas;

import entidades.Pagamento;

import java.util.ArrayList;

public class Financeiro {
    ArrayList<Pagamento> pagamentos = new ArrayList();

    public Pagamento getFolhaDePagamentoPeloId(String idDestinatario) {
        return new Pagamento(idDestinatario, 1400.00);
    }

    public double getBalancoDeContas() {
            
        double valorTotal = 0;
        
        pagamentos.add(new Pagamento("02", 1300.00));
        pagamentos.add(new Pagamento("03", 4400.00));
        pagamentos.add(new Pagamento("04", 2400.00));
            

        for (Pagamento pagamento:
             pagamentos) {
            valorTotal += pagamento.getValor();
        }
         
            return valorTotal;
    }
}
