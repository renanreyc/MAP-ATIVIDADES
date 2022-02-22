package main.entidades;

import main.funcoes.IFuncao;

import java.util.ArrayList;
import java.util.List;

public class Escala extends Entidade {

    private Funcionario funcionario;
    private Filme filme;

    private List<IFuncao> funcoes;

    public Escala(Funcionario funcionario, Filme filme) {
        this.funcionario = funcionario;
        this.filme = filme;

        this.funcoes = new ArrayList<>();
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public List<IFuncao> getFuncoes() {
        return funcoes;
    }

    public void addFuncao(IFuncao funcao) {
        this.funcoes.add(funcao);
    }

    public String getListaDeFuncoes() {
        StringBuilder builder = new StringBuilder();

        builder.append("\n");
        builder.append("======= Funcoes  do Funcionario " + this.funcionario.getNome() + " no Filme: " + this.filme.getNome() + " ===========");

        int i = 1;
        for (IFuncao funcao : this.funcoes) {
            builder.append("\n");
            builder.append("Função [" + i + "]: " + funcao.getFuncao());
            i++;
        }

        return builder.toString();
    }

    public boolean possuiFuncao(String nomeDaFuncao) {

        for (IFuncao funcao : funcoes) {
            if (funcao.getFuncao().equals(nomeDaFuncao))
                return true;
        }

        return false;
    }
}
