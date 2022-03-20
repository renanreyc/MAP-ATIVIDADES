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


public class VisitorCalcularAreaTest {
	
	private VisitorCalcularArea visitorCalcularArea;
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
		this.visitorCalcularArea = new VisitorCalcularArea();
	}
	
	@Test
	public void testVisitaRetangulo() {
		double area = this.retangulo.getAltura() * this.retangulo.getLargura();
		assertEquals(this.visitorCalcularArea.visitaRetangulo(this.retangulo), area, 2); 
	}
	
	@Test
	public void testVisitaTriangulo() {
		double area = (this.triangulo.getBase() * this.triangulo.getAltura()) / 2;
		assertEquals(this.visitorCalcularArea.visitaTriangulo(this.triangulo), area, 2); 
	}
	
	@Test
	public void testVisitaCirculo() {
		double area = 3.14 * (this.circulo.getRaio() * this.circulo.getRaio());
		assertEquals(this.visitorCalcularArea.visitaCirculo(this.circulo), area, 2); 
	}
	
	@Test
	public void testVisitarTrapezio() {
		double area = (this.trapezio.getBaseMaior() + this.trapezio.getBaseMenor()) + (2 * this.trapezio.getAltura());;
		assertEquals(this.visitorCalcularArea.visitarTrapezio(this.trapezio), area, 2); 
	}
}
