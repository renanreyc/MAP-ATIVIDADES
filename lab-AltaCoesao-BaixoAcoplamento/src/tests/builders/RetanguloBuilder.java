package tests.builders;

import main.figuras.Retangulo;

public class RetanguloBuilder {
    private Retangulo retangulo;

    public static RetanguloBuilder mockRetangulo() {
        RetanguloBuilder builder = new RetanguloBuilder();
        builder.retangulo = new Retangulo(5, 3);

        return builder;
    }

    public Retangulo getRetangulo(){
        return this.retangulo;
    }
}
