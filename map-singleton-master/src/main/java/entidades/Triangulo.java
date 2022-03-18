package entidades;

import enums.TrianguloTipos;

import java.util.HashMap;

public class Triangulo {

    private int id;
    private TrianguloTipos tipo;
    private static HashMap<TrianguloTipos, Triangulo> trianguloInstances = new HashMap<>();

    private Triangulo(int id, TrianguloTipos tipo) {
        this.tipo = tipo;
        this.id= id;
    }

    public int getId() {
        return id;
    }

    public TrianguloTipos getTipo() {
        return tipo;
    }
    public static Triangulo getInstance(TrianguloTipos tipo) {
        Triangulo triangulo = trianguloInstances.get(tipo);

        if(triangulo != null) {
            return triangulo;
        }

        triangulo = new Triangulo(1, tipo);
        trianguloInstances.put(tipo, triangulo);
        return triangulo;
    }

    public static int getQuantidadeDeInstanciasTriangulos() {
        return Triangulo.trianguloInstances.size();
    }

    @Override
    public String toString() {
        return "Triangulo " + this.id + " : " + this.tipo ;
    }

}
