package main.entities;

public class Historico extends Entity {

    private String disciplina;

    public String getProfessor() {
        return professor;
    }

    public void setProfessor(String professor) {
        this.professor = professor;
    }

    private String professor;
    private String sala;
    private double nota;

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

    public String getSala() {
        return sala;
    }

    public void setSala(String sala) {
        this.sala = sala;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Historico(String disciplina, String sala, double nota, String professor) {
        this.disciplina = disciplina;
        this.sala = sala;
        this.nota = nota;
        this.professor = professor;
    }
}
