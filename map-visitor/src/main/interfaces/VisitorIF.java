package main.interfaces;

import main.objetos.*;

public interface VisitorIF {
    double visitaRetangulo(Retangulo r);
    double visitaTriangulo(Triangulo t);
    double visitaCirculo(Circulo c);
    double visitarTrapezio(Trapezio t);
}
