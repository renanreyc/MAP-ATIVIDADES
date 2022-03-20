package main.objetos;

import main.interfaces.ElementoConcretoIF;
import main.interfaces.VisitorIF;

public class Trapezio implements ElementoConcretoIF {

    private double baseMenor;
    private double baseMaior;
    private double lado1;
    private double lado2;
    private double altura;

    public Trapezio(double baseMenor, double baseMaior, double lado1, double lado2, double altura) {
        this.baseMenor = baseMenor;
        this.baseMaior = baseMaior;
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.altura = altura;
    }

    public double getBaseMenor() {
        return baseMenor;
    }

    public void setBaseMenor(double baseMenor) {
        this.baseMenor = baseMenor;
    }

    public double getBaseMaior() {
        return baseMaior;
    }

    public void setBaseMaior(double baseMaior) {
        this.baseMaior = baseMaior;
    }

    public double getLado1() {
        return lado1;
    }

    public void setLado1(double lado1) {
        this.lado1 = lado1;
    }

    public double getLado2() {
        return lado2;
    }

    public void setLado2(double lado2) {
        this.lado2 = lado2;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void aceitaVisita(VisitorIF v) {
        double result = v.visitarTrapezio(this);

        if (result != 0)
            System.out.println(result);
    }
}
