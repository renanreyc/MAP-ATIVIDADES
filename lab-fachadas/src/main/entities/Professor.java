package main.entities;

import main.enums.Proficiencias;

public class Professor extends Entity {

    private String nome;
    private Proficiencias proficiencia;
    private boolean alocado;
    private double salario;

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

    public boolean isAlocado() {
        return alocado;
    }

    public void setAlocado(boolean alocado) {
        this.alocado = alocado;
    }


    public Professor(String nome, Proficiencias proficiencia, double salario) {
        this.nome = nome;
        this.proficiencia = proficiencia;
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
