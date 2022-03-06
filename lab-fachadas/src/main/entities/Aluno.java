package main.entities;

import java.util.List;
public class Aluno extends Entity {

    private String nome;
    private List<Matricula> matriculas;
    private List<Historico> historicos;

    public Aluno(String nome, List<Matricula> matriculas, List<Historico> historicos) {
        this.nome = nome;
        this.matriculas = matriculas;
        this.historicos = historicos;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Matricula> getMatriculas() {
        return matriculas;
    }

    public void setMatriculas(List<Matricula> matriculas) {
        this.matriculas = matriculas;
    }

    public List<Historico> getHistoricos() {
        return historicos;
    }

    public void setHistoricos(List<Historico> historicos) {
        this.historicos = historicos;
    }
}