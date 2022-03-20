5package builders;

import figuras.Circulo;

public class CirculoBuilder {
	
	private Circulo circulo;
	
	public static CirculoBuilder mockCirculo() {
		CirculoBuilder builder = new CirculoBuilder();
		builder.circulo = new Circulo(5);
		
		return builder;
	}
	
	public Circulo getCirculo() {
		return this.circulo;
	}
}