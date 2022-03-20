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

public class VisitorDesenhaFiguraTest {

	private VisitorDesenhaFigura visitorDesenhaFigura;
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
		this.visitorDesenhaFigura = new VisitorDesenhaFigura();
	}
	
	@Test
    public void testVisitaRetangulo() {
        String desenho = "Desenhar Retangulo";
        assertEquals(this.visitorDesenhaFigura.visitaRetangulo(this.retangulo), 0, 2);
    }

	@Test
    public void testVisitaTriangulo() {
    	String desenho = "Desenhar Triangulo";
    	assertEquals(this.visitorDesenhaFigura.visitaTriangulo(this.triangulo), 0, 2);
    }

	@Test
    public void testVisitaCirculo() {
    	String desenho ="Desenhar Circulo";
    	assertEquals(this.visitorDesenhaFigura.visitaCirculo(this.circulo), 0, 2);
    }

	@Test
    public void testVisitarTrapezio() {
    	String desenho = "Desenhar Trapezio";
    	assertEquals(this.visitorDesenhaFigura.visitarTrapezio(this.trapezio), 0, 2);
    }
}
