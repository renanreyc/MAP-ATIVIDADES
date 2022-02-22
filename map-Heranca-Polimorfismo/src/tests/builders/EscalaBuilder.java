package tests.builders;

import java.util.ArrayList;
import java.util.Collection;

import main.entidades.Escala;
import main.entidades.Filme;
import main.entidades.Funcionario;

public class EscalaBuilder {

    private Escala escala;
    private Collection<Escala> collectionEscala;

    public static EscalaBuilder mockEscala() {
        Filme filme = FilmeBuilder.mockFilme().getFilme();
        Funcionario funcionario = FuncionarioBuilder.mockFuncionario().getFuncionario();
        EscalaBuilder builder = new EscalaBuilder();
        builder.escala = new Escala(funcionario, filme);

        return builder;
    }

    public static EscalaBuilder mockCollectionEscala() {
        EscalaBuilder builder = new EscalaBuilder();
        builder.collectionEscala = new ArrayList<Escala>();

        for(int i=0; i<10; i++) {
            Escala escala = new Escala(FuncionarioBuilder.mockFuncionario().getFuncionario(), FilmeBuilder.mockFilme().getFilme());

            builder.collectionEscala.add(escala);
        }
        return builder;
    }

    public Escala getEscala() {
        return this.escala;
    }

}
