package subsistemas;

import entidades.Item;
import entidades.Pedido;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AlmoxarifadoTest {

    private Almoxarifado almoxarifado;

    @BeforeEach
    public void setup() {
        this.almoxarifado = new Almoxarifado();
    }


    @Test
    void getEstoque() {
        List<Item> estoque = this.almoxarifado.getEstoque();
        assertEquals(2, estoque.size());
        addItem(estoque);
    }

    void addItem(List<Item> estoque){
        Item item = new Item("Mesas", 10);
        estoque.add(item);
        assertEquals(3, estoque.size());
    }

    @Test
    void getPedidos() {
        List<Pedido> pedidos = this.almoxarifado.getPedidos();
        assertEquals(1, pedidos.size());
    }
}