package main.entities;

import java.util.List;
public class Aluno extends Entity {

    private String nome;
    private List<Matricula> matriculas;
    private List<Historico> historico;

    public Aluno(String nome, List<Matricula> matriculas, List<Historico> historico) {
        this.nome = nome;
        this.matriculas = matriculas;
        this.historico = historico;
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

    public List<Historico> getHistorico() {
        return historico;
    }

    public void setHistorico(List<Historico> historico) {
        this.historico = historico;
    }
}