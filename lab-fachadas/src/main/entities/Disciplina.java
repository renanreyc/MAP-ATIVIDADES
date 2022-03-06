package main.entities;

import main.enums.Proficiencias;

public class Disciplina extends Entity {

    private String nome;
    private Proficiencias proficiencia;

    public Disciplina(String nome, Proficiencias proficiencia) {
        this.nome = nome;
        this.proficiencia = proficiencia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Proficiencias getProficiencia() {
        return proficiencia;
    }

    public void setProficiencia(Proficiencias proficiencia) {
        this.proficiencia = proficiencia;
    }
}

