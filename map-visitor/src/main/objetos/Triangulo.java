package main.objetos;

import main.interfaces.ElementoConcretoIF;
import main.interfaces.VisitorIF;

public class Triangulo implements ElementoConcretoIF {

    private double base;
    private double altura;

    public Triangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void aceitaVisita(VisitorIF v) {
        double result = v.visitaTriangulo(this);

        if (result != 0)
            System.out.println(result);
    }
}
