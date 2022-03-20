package builders;

import figuras.Trapezio;;

public class TrapezioBuilder {

	private Trapezio trapezio;
	
	public static TrapezioBuilder mockTrapezio() {
		TrapezioBuilder builder = new TrapezioBuilder();
		builder.trapezio = new Trapezio(3, 5, 4, 4, 5);
		
		return builder;
	}
	
	public Trapezio getTrapezio() {
		return this.trapezio;
	}
}
