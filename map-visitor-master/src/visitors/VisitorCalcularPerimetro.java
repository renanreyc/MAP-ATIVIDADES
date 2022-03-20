package visitors;

import figuras.Circulo;
import figuras.Retangulo;
import figuras.Trapezio;
import figuras.Triangulo;
import interfaces.VisitorIF;

public class VisitorCalcularPerimetro implements VisitorIF {
    @Override
    public double visitaRetangulo(Retangulo r) {
        return 2 * (r.getAltura() + r.getLargura());
    }

    @Override
    public double visitaTriangulo(Triangulo t) {
        return t.getBase() + (2 * t.getAltura());
    }

    @Override
    public double visitaCirculo(Circulo c) {
        return 2 * 3.14 * c.getRaio();
    }

    @Override
    public double visitarTrapezio(Trapezio t) {
        return t.getBaseMenor() + t.getBaseMaior() + t.getLado1() + t.getLado2();
    }
}
