package builders;

import figuras.Triangulo;

public class TrianguloBuilder {

	private Triangulo triangulo;
	
	public static TrianguloBuilder mockTriangulo() {
		TrianguloBuilder builder = new TrianguloBuilder();
		builder.triangulo = new Triangulo(3, 5);
		
		return builder;
	}
	
	public Triangulo getTriangulo() {
		return this.triangulo;
	}
}
