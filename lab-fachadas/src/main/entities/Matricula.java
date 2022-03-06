package main.entities;

public class Matricula {

    public Aluno aluno;
    public Disciplina disciplina;
    public Sala sala;
    public double nota;

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public Matricula(Aluno aluno, Disciplina disciplina, Sala sala, double nota) {
        this.aluno = aluno;
        this.disciplina = disciplina;
        this.sala = sala;
        this.nota = nota;
    }
}