package main.objetos;

import main.interfaces.ElementoConcretoIF;
import main.interfaces.VisitorIF;

public class Circulo implements ElementoConcretoIF {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public void aceitaVisita(VisitorIF v) {
        double result = v.visitaCirculo(this);

        if (result != 0)
            System.out.println(result);
    }
}
