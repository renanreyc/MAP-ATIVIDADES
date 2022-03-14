package entidades;

import enums.TrianguloTipos;

public class Triangulo {

    private int id;
    private TrianguloTipos tipo;

    public Triangulo(int id, TrianguloTipos tipo) {
        this.tipo = tipo;
        this.id= id;
    }

    public int getId() {
        return id;
    }

    public TrianguloTipos getTipo() {
        return tipo;
    }

    @Override
    public String toString() {
        return "Triangulo " + this.id + " : " + this.tipo ;
    }

}
