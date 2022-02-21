package tests.builders;

import main.figuras.Quadrado;

public class QuadradoBuilder {
    private Quadrado quadrado;

    public static QuadradoBuilder mockQuadrado() {
        QuadradoBuilder builder = new QuadradoBuilder();
        builder.quadrado = new Quadrado(5);

        return builder;
    }

    public Quadrado getQuadrado(){
        return this.quadrado;
    }
}
