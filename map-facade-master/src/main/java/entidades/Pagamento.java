package entidades;

public class Pagamento {
    private double valor;
    private String id;

    public Pagamento(String id, double valor) {
        this.valor = valor;
        this.id = id;
    }

    public double getValor() {
        return valor;
    }

    public String getId() {
        return id;
    }

}
