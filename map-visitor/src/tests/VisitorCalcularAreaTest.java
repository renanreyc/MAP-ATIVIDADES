package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.objetos.*;
import main.visitors.*;
import main.interfaces.VisitorIF;

public class VisitorCalcularAreaTest {

    @Test
    public void testVisitaRetangulo() {
        Retangulo retangulo = new Retangulo(3,5);
        double area = retangulo.getAltura() * retangulo.getLargura();

        VisitorIF visitorArea = new VisitorCalcularArea();

        assertEquals(visitorArea.visitaRetangulo(retangulo), area, 2);
    }

    @Test
    public void testVisitaTriangulo() {
        Triangulo triangulo = new Triangulo(3, 5);
        double area = (triangulo.getBase() * triangulo.getAltura()) / 2;

        VisitorIF visitorArea = new VisitorCalcularArea();

        assertEquals(visitorArea.visitaTriangulo(triangulo), area, 2);
    }

    @Test
    public void testVisitaCirculo() {
        Circulo circulo = new Circulo(5);
        double area = 3.14 * (circulo.getRaio() * circulo.getRaio());

        VisitorIF visitorArea = new VisitorCalcularArea();

        assertEquals(visitorArea.visitaCirculo(circulo), area, 2);
    }

    @Test
    public void testVisitarTrapezio() {
        Trapezio trapezio = new Trapezio(3, 5, 4, 4, 5);
        double area = (trapezio.getBaseMaior() + trapezio.getBaseMenor()) + (2 * trapezio.getAltura());

        VisitorIF visitorArea = new VisitorCalcularArea();

        assertEquals(visitorArea.visitarTrapezio(trapezio), area, 2);
    }
}

