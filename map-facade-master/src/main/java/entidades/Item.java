package entidades;

public class Item {
    private String nome;
    private int quantidade;

    public Item(String nome, int quantidade) {
        this.nome = nome;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
        builder.append(this.nome);
        builder.append(" - ");
        builder.append("Quantidade: ");
        builder.append(this.quantidade);

        return builder.toString();
    }
}
