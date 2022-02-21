package main.entidades;

import java.util.ArrayList;
import java.util.List;

public class Filme extends Entidade {

    private String nome;
    private String ano;
    private List<Escala> escalas;

    public Filme(String nome, String ano) {
        this.nome = nome;
        this.ano = ano;

        this.escalas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAno() {
        return ano;
    }

    public void setAno(String ano) {
        this.ano = ano;
    }

    public List<Escala> getEscalas() {
        return escalas;
    }

    public void addEscala(Escala escala) {
        this.escalas.add(escala);
    }
}
