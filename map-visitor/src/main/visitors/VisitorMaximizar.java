package main.visitors;

import main.objetos.*;
import main.interfaces.VisitorIF;

public class VisitorMaximizar implements VisitorIF {
    @Override
    public double visitaRetangulo(Retangulo r) {
        r.setAltura(r.getAltura() * 2);
        r.setLargura(r.getLargura() * 2);
        System.out.println("Retangulo Maximizado");
        return 0;
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        t.setAltura(t.getAltura() * 2);
        t.setBase(t.getBase() * 2);
        System.out.println("Triangulo Maximizado");
        return 0;
    }

    @Override
    public double visitaCirculo(Circulo c) {
        c.setRaio(c.getRaio() * 2);
         System.out.println("Circulo Maximizado");
        return 0;
    }

    @Override
    public double visitarTrapezio(Trapezio t) {
        t.setAltura(t.getAltura() * 2);
        t.setBaseMenor(t.getBaseMenor() * 2);
        t.setBaseMaior(t.getBaseMaior() * 2);
        t.setLado1(t.getLado1() * 2);
        t.setLado2(t.getLado2() * 2);
        System.out.println("Trapezio Maximizado");
        return 0;
    }
}
