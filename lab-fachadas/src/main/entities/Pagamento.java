package main.entities;

import main.enums.TipoPagamento;
import main.enums.Credor;

public class Pagamento extends Entity {

    private TipoPagamento tipo;
    private Credor credor;
    private double valor;
    private String nome;

    public TipoPagamento getTipo() {
        return tipo;
    }

    public void setTipo(TipoPagamento tipo) {
        this.tipo = tipo;
    }

    public Credor getCredor() {
        return credor;
    }

    public void setCredor(Credor credor) {
        this.credor = credor;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pagamento(TipoPagamento tipo, Credor credor, double valor, String nome) {
        this.tipo = tipo;
        this.credor = credor;
        this.valor = valor;
        this.nome = nome;
    }

    public Pagamento(Credor credor, double valor) {
        this.credor = credor;
        this.valor = valor;
    }
}