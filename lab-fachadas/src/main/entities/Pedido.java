package main.entities;

public class Pedido extends Entity {

    private Item item;
    private double valor;

    public boolean isFinalizado() {
        return finalizado;
    }

    public void setFinalizado(boolean finalizado) {
        this.finalizado = finalizado;
    }

    private boolean finalizado;

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public Pedido(Item item, double valor) {
        this.item = item;
        this.valor = valor;
    }
}
