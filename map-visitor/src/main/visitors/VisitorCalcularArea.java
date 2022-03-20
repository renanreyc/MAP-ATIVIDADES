package main.visitors;

import main.objetos.*;
import main.interfaces.VisitorIF;

public class VisitorCalcularArea implements VisitorIF {

    @Override
    public double visitaRetangulo(Retangulo r) {
        return r.getAltura() * r.getLargura();
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        return (t.getBase() * t.getAltura()) / 2;
    }

    @Override
    public double visitaCirculo(Circulo c) {
        return 3.14 * (c.getRaio() * c.getRaio());
    }

    @Override
    public double visitarTrapezio(Trapezio t) {
        return (t.getBaseMaior() + t.getBaseMenor()) + (2 * t.getAltura());
    }
}
