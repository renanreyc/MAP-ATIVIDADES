package main;

import main.objetos.*;
import main.visitors.*;
import main.interfaces.VisitorIF;

public class Main {

    public static void main(String[] args) {

        VisitorIF area = new VisitorCalcularArea();
        VisitorIF perimetro = new VisitorCalcularPerimetro();
        VisitorIF desenho = new VisitorDesenhaFigura();
        VisitorIF maximizar = new VisitorMaximizar();

        VisitorIF[] visitors = new VisitorIF[] { area, perimetro, desenho, maximizar };

        Retangulo retangulo = new Retangulo(2, 4);
        Triangulo triangulo = new Triangulo(3, 5);
        Circulo circulo = new Circulo(5);
        Trapezio trapezio = new Trapezio(3, 5, 4, 4, 5);

        for (VisitorIF visitor: visitors) {
            System.out.println();
            System.out.println(visitor.getClass().getName());
            System.out.println("Retangulo");
            retangulo.aceitaVisita(visitor);
            System.out.println("Triangulo");
            triangulo.aceitaVisita(visitor);
            System.out.println("Circulo");
            circulo.aceitaVisita(visitor);
            System.out.println("Trapezio");
            trapezio.aceitaVisita(visitor);
        }
    }
}
