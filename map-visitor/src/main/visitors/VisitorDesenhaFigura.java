package main.visitors;

import main.objetos.*;
import main.interfaces.VisitorIF;

public class VisitorDesenhaFigura implements VisitorIF {
    @Override
    public double visitaRetangulo(Retangulo r) {
        System.out.println("Desenhar Retangulo");
        return 0;
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        System.out.println("Desenhar Triangulo");
        return 0;
    }

    @Override
    public double visitaCirculo(Circulo c) {
        System.out.println("Desenhar Circulo");
        return 0;
    }

    @Override
    public double visitarTrapezio(Trapezio t) {
        System.out.println("Desenhar Trapezio");
        return 0;
    }
}
