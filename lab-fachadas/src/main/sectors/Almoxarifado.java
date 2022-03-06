package main.sectors;

import main.entities.Item;
import main.entities.Pedido;
import main.BaseRepository;

import java.util.List;
import java.util.stream.Collectors;

public class Almoxarifado {

    private BaseRepository<Item> items;
    private BaseRepository<Pedido> pedidos;

    public Almoxarifado(BaseRepository<Item> items, BaseRepository<Pedido> pedidos) {
        this.items = items;
        this.pedidos = pedidos;
    }

    public Item adicionarItemAoEstoque(String nome, int quantidade) {
        Item item = new Item(nome, quantidade);
        return this.items.save(item);
    }

    public Pedido gerarPedido(String nome, int quantidade, double valor) {
        Pedido pedido = new Pedido(new Item(nome, quantidade), valor);
        return this.pedidos.save(pedido);
    }

    public List<Pedido> recuperarPedidosAbertos() {
        return this.pedidos.getAll().stream().filter(e -> !e.isFinalizado()).collect(Collectors.toList());
    }

    public BaseRepository<Item> getItems() {
        return items;
    }
}
