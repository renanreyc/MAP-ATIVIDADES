package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.objetos.*;
import main.visitors.*;
import main.interfaces.VisitorIF;

public class VisitorDesenharFiguraTest {

    @Test
    public void testVisitaRetangulo() {
        Retangulo retangulo = new Retangulo(3,5);
        String desenho = "Desenhar Retangulo";

        VisitorIF visitorDesenha = new VisitorDesenhaFigura();

        assertEquals(visitorDesenha.visitaRetangulo(retangulo), 0, 2);
    }

    @Test
    public void testVisitaTriangulo() {
        Triangulo triangulo = new Triangulo(3, 5);
        String desenho = "Desenhar Triangulo";

        VisitorIF visitorDesenha = new VisitorDesenhaFigura();

        assertEquals(visitorDesenha.visitaTriangulo(triangulo), 0, 2);
    }

    @Test
    public void testVisitaCirculo() {
        Circulo circulo = new Circulo(5);
        String desenho ="Desenhar Circulo";

        VisitorIF visisitorDesenha = new VisitorDesenhaFigura();

        assertEquals(visisitorDesenha.visitaCirculo(circulo), 0, 2);
    }

    @Test
    public void testVisitarTrapezio() {
        Trapezio trapezio = new Trapezio(3, 5, 4, 4, 5);
        String desenho = "Desenhar Trapezio";

        VisitorIF visitorDesenha = new VisitorDesenhaFigura();

        assertEquals(visitorDesenha.visitarTrapezio(trapezio), 0, 2);
    }
}
