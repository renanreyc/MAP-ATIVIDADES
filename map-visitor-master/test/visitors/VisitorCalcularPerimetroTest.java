package visitors;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import builders.CirculoBuilder;
import builders.RetanguloBuilder;
import builders.TrapezioBuilder;
import builders.TrianguloBuilder;
import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;

public class VisitorCalcularPerimetroTest {

	private VisitorCalcularPerimetro visitorCalcularPerimetro;
	private Circulo circulo;
	private Retangulo retangulo;
	private Trapezio trapezio;
	private Triangulo triangulo;
	
	@Before
    public void setUp(){
		this.circulo = CirculoBuilder.mockCirculo().getCirculo();
		this.retangulo = RetanguloBuilder.mockRetangulo().getRetangulo();
		this.trapezio = TrapezioBuilder.mockTrapezio().getTrapezio();
		this.triangulo = TrianguloBuilder.mockTriangulo().getTriangulo();
		this.visitorCalcularPerimetro = new VisitorCalcularPerimetro();
	}
	
	@Test
    public void testVisitaRetangulo() {
        double perimetro = 2 * (this.retangulo.getAltura() + this.retangulo.getLargura());
        assertEquals(this.visitorCalcularPerimetro.visitaRetangulo(this.retangulo), perimetro, 2);
    }

	@Test
    public void testVisitaTriangulo() {
		 double perimetro = this.triangulo.getBase() + (2 * this.triangulo.getAltura());
		 assertEquals(this.visitorCalcularPerimetro.visitaTriangulo(this.triangulo), perimetro, 2);
    }

	@Test
    public void testVisitaCirculo() {
		 double perimetro = 2 * 3.14 * this.circulo.getRaio();
		 assertEquals(this.visitorCalcularPerimetro.visitaCirculo(this.circulo), perimetro, 2);
    }

	@Test
    public void testVisitarTrapezio() {
		 double perimetro = this.trapezio.getBaseMenor() + this.trapezio.getBaseMaior() + this.trapezio.getLado1() + this.trapezio.getLado2();
		 assertEquals(this.visitorCalcularPerimetro.visitarTrapezio(this.trapezio), perimetro, 2);
	}
}
