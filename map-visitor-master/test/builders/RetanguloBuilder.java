package builders;

import figuras.Retangulo;

public class RetanguloBuilder {
	
	private Retangulo retangulo;
	
	public static RetanguloBuilder mockRetangulo() {
		RetanguloBuilder builder = new RetanguloBuilder();
		builder.retangulo = new Retangulo(3, 5);
		
		return builder;
	}
	
	public Retangulo getRetangulo() {
		return this.retangulo;
	}
}
