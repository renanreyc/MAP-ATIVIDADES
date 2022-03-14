package subsistemas;

import entidades.Item;
import entidades.Pedido;
import java.util.ArrayList;

import java.util.List;

public class Almoxarifado {
    private List<Item> estoque = new ArrayList<>();
    private List<Pedido> pedidos = new ArrayList<>();


    public List<Item> getEstoque(){
        Item item1 = new Item("cama", 1);
        Item item2 = new Item("travesseiro", 2);

        estoque.add(item1);
        estoque.add(item2);

        return estoque;
    }

    public List<Pedido> getPedidos(){
        Pedido pedido = new Pedido("Dormir", 8);

        pedidos.add(pedido);
        return pedidos;
    }
}