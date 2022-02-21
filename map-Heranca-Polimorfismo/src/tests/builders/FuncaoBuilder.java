package tests.builders;

import main.funcoes.Funcao;
import main.funcoes.ListaFuncoes;

public class FuncaoBuilder {

    private Funcao funcao;

    public static FuncaoBuilder mockFuncao() {
        FuncaoBuilder builder = new FuncaoBuilder();
        builder.funcao = new Funcao(ListaFuncoes.ATOR.getNome());

        return builder;
    }

    public Funcao getFuncao() {
        return this.funcao;
    }

}