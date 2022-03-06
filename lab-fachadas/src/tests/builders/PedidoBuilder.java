package tests.builders;

import java.util.ArrayList;
import java.util.Collection;

import main.entities.Pedido;

public class PedidoBuilder {
	
	private Pedido pedido;
	private Collection<Pedido> pedidos;
	
	public static PedidoBuilder mockPedido() {
		PedidoBuilder builder = new PedidoBuilder();
		builder.pedido = new Pedido(builders.ItemBuilder.mockItem().getItem(), new Double(20));
		
		return builder;
	}
	
	public static PedidoBuilder mockCollectionPedidos(){
		PedidoBuilder builder = new PedidoBuilder();
		builder.pedidos = new ArrayList<Pedido>();
		
		for(int i=0; i<10; i++) {
			Pedido pedido = new Pedido(builders.ItemBuilder.mockItem().getItem(), new Double(i));
			
			builder.pedidos.add(pedido);
		}
		
		return builder;
	}
	
	public Pedido getPedido() {
		return this.pedido;
	}
	
	public Collection<Pedido> getPedidos(){
		return this.pedidos;
	}
}
