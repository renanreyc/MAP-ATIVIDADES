package main.objetos;

import main.interfaces.ElementoConcretoIF;
import main.interfaces.VisitorIF;

public class Retangulo implements ElementoConcretoIF {

    private double altura;
    private double largura;

    public Retangulo(double altura, double largura) {
        this.altura = altura;
        this.largura = largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public void aceitaVisita(VisitorIF v) {
        double result = v.visitaRetangulo(this);

        if (result != 0)
            System.out.println(result);
    }
}
