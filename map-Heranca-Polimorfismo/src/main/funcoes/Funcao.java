package main.funcoes;

public class Funcao implements IFuncao {

    private final String funcao;

    public Funcao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public String getFuncao() {
        return this.funcao;
    }
}
