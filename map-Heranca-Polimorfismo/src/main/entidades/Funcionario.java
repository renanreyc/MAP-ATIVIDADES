package main.entidades;

import main.funcoes.IFuncao;

import java.util.ArrayList;
import java.util.List;

public class Funcionario extends Entidade {

    private String nome;
    private List<Escala> escalas;

    public Funcionario(String nome) {
        this.nome = nome;

        this.escalas = new ArrayList<>();
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Escala> getEscalas() {
        return this.escalas;
    }

    public void addEscala(Escala escala) {
        this.escalas.add(escala);
    }
}
