package tests;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import main.objetos.*;
import main.visitors.*;
import main.interfaces.VisitorIF;

public class VisitorMaximizarTest {

    @Test
    public void testMaximizaRetanguloArea() {
        Retangulo retangulo = new Retangulo(3,5);
        double area = (retangulo.getAltura() * 2) * (retangulo.getLargura() * 2);
        String desenho = "Retangulo Maximizado";

        VisitorIF visitorMaximizar = new VisitorMaximizar();
        VisitorIF visitorArea = new VisitorCalcularArea();

        visitorMaximizar.visitaRetangulo(retangulo);

        assertEquals(visitorArea.visitaRetangulo(retangulo), area,2);
    }

    @Test
    public void testMaximizaRetanguloPerimetro() {
        Retangulo retangulo = new Retangulo(3,5);
        double perimetro = 2 * (retangulo.getAltura() * 2 + retangulo.getLargura() * 2);
        String desenho = "Retangulo Maximizado";

        VisitorIF visitorMaximizar = new VisitorMaximizar();
        VisitorIF visitorPerimetro = new VisitorCalcularPerimetro();

        visitorMaximizar.visitaRetangulo(retangulo);

        assertEquals(visitorPerimetro.visitaRetangulo(retangulo), perimetro,2);
    }

    @Test
    public void testMaximizaTrianguloArea() {
        Triangulo triangulo = new Triangulo(3,5);
        double area = ((triangulo.getAltura() * 2) * (triangulo.getBase() * 2)) / 2;
        String desenho = "Triangulo Maximizado";

        VisitorIF visitorMaximizar = new VisitorMaximizar();
        VisitorIF visitorArea = new VisitorCalcularArea();

        visitorMaximizar.visitaTriangulo(triangulo);

        assertEquals(visitorArea.visitaTriangulo(triangulo), area,2);
    }

    @Test
    public void testMaximizaTrianguloPerimetro() {
        Triangulo triangulo = new Triangulo(3,5);
        double perimetro = triangulo.getBase() * 2 + (2 * triangulo.getAltura() * 2);
        String desenho = "Triangulo Maximizado";

        VisitorIF visitorMaximizar = new VisitorMaximizar();
        VisitorIF visitorPerimetro = new VisitorCalcularPerimetro();

        visitorMaximizar.visitaTriangulo(triangulo);

        assertEquals(visitorPerimetro.visitaTriangulo(triangulo), perimetro,2);
    }

    @Test
    public void testMaximizaCirculoArea() {
        Circulo circulo = new Circulo(5);
        double area = 3.14 * ((circulo.getRaio() * 2) * (circulo.getRaio()*2));
        String desenho = "Circulo Maximizado";

        VisitorIF visitorMaximizar = new VisitorMaximizar();
        VisitorIF visitorArea = new VisitorCalcularArea();

        visitorMaximizar.visitaCirculo(circulo);

        assertEquals(visitorArea.visitaCirculo(circulo), area,2);
    }

    @Test
    public void testMaximizaCirculoPerimetro() {
        Circulo circulo = new Circulo(5);
        double perimetro = 2 * 3.14 * circulo.getRaio() * 2;
        String desenho = "Circulo Maximizado";

        VisitorIF visitorMaximizar = new VisitorMaximizar();
        VisitorIF visitorPerimetro = new VisitorCalcularPerimetro();

        visitorMaximizar.visitaCirculo(circulo);

        assertEquals(visitorPerimetro.visitaCirculo(circulo), perimetro,2);
    }

    @Test
    public void testMaximizaTrapezioArea() {
        Trapezio trapezio = new Trapezio(3, 5, 4, 4, 5);
        double area = (trapezio.getBaseMaior() * 2 + trapezio.getBaseMenor() * 2) + (2 * trapezio.getAltura() * 2);
        String desenho = "Trapezio Maximizado";

        VisitorIF visitorMaximizar = new VisitorMaximizar();
        VisitorIF visitorArea = new VisitorCalcularArea();

        visitorMaximizar.visitarTrapezio(trapezio);

        assertEquals(visitorArea.visitarTrapezio(trapezio), area,2);
    }

    @Test
    public void testMaximizaTrapezioPerimetro() {
        Trapezio trapezio = new Trapezio(3, 5, 4, 4, 5);
        double perimetro = trapezio.getBaseMenor() * 2 + trapezio.getBaseMaior() * 2 + trapezio.getLado1() * 2 + trapezio.getLado2() * 2;
        String desenho = "Trapezio Maximizado";

        VisitorIF visitorMaximizar = new VisitorMaximizar();
        VisitorIF visitorPerimetro = new VisitorCalcularPerimetro();

        visitorMaximizar.visitarTrapezio(trapezio);

        assertEquals(visitorPerimetro.visitarTrapezio(trapezio), perimetro,2);
    }

}
