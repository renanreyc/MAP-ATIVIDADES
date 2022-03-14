package entidades;

public class Pedido {
    private String itemPedido;
    private int quantidade;

    public Pedido(String itemPedido, int quantidade) {
        this.itemPedido = itemPedido;
        this.quantidade = quantidade;
    }

    public String getItemPedido() {
        return itemPedido;
    }

    public void setItemPedido(String itemPedido) {
        this.itemPedido = itemPedido;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        
        builder.append("Item: ");
        builder.append(this.itemPedido);
        builder.append(" - ");
        builder.append("Quantidade: ");
        builder.append(this.quantidade);
        return builder.toString();
    }
}
