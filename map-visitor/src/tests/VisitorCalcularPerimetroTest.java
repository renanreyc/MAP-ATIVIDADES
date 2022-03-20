package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.objetos.*;
import main.visitors.*;
import main.interfaces.VisitorIF;

public class VisitorCalcularPerimetroTest {

    @Test
    public void testVisitaRetangulo() {
        Retangulo retangulo = new Retangulo(3,5);
        double perimetro = 2 * (retangulo.getAltura() + retangulo.getLargura());

        VisitorIF visitorPerimetro = new VisitorCalcularPerimetro();

        assertEquals(visitorPerimetro.visitaRetangulo(retangulo), perimetro, 2);
    }

    @Test
    public void testVisitaTriangulo() {
        Triangulo triangulo = new Triangulo(3, 5);
        double perimetro = triangulo.getBase() + (2 * triangulo.getAltura());

        VisitorIF visitorPerimetro = new VisitorCalcularPerimetro();

        assertEquals(visitorPerimetro.visitaTriangulo(triangulo), perimetro, 2);
    }

    @Test
    public void testVisitaCirculo() {
        Circulo circulo = new Circulo(5);
        double perimetro = 2 * 3.14 * circulo.getRaio();

        VisitorIF visitorPerimetro = new VisitorCalcularPerimetro();

        assertEquals(visitorPerimetro.visitaCirculo(circulo), perimetro, 2);
    }

    @Test
    public void testVisitarTrapezio() {
        Trapezio trapezio = new Trapezio(3, 5, 4, 4, 5);
        double perimetro = trapezio.getBaseMenor() + trapezio.getBaseMaior() + trapezio.getLado1() + trapezio.getLado2();

        VisitorIF visitorPerimetro = new VisitorCalcularPerimetro();

        assertEquals(visitorPerimetro.visitarTrapezio(trapezio), perimetro, 2);
    }
}
