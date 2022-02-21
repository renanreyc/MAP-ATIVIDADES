package tests.builders;


import java.util.UUID;

import main.entidades.Filme;

public class FilmeBuilder {

    private Filme filme;

    public static FilmeBuilder mockFilme() {
        FilmeBuilder builder = new FilmeBuilder();
        builder.filme = new Filme("Filme teste", "1993");
        builder.filme.setId(UUID.randomUUID());

        return builder;
    }

    public Filme getFilme() {
        return this.filme;
    }

}