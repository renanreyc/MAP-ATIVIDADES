package main.entities;


import java.util.ArrayList;
import java.util.List;

public class Sala extends Entity {

    private String codigo;
    private Professor professor;
    private Disciplina disciplina;
    private List<Aluno> alunos;
    private boolean disponivel;

    public Sala(String codigo) {
        this.alunos = new ArrayList<>();
        this.codigo = codigo;
        this.disponivel = true;
    }

    public Professor getProfessor() {
        return professor;
    }

    public void setProfessor(Professor professor) {
        this.professor = professor;
    }

    public Disciplina getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(Disciplina disciplina) {
        this.disciplina = disciplina;
    }

    public List<Aluno> getAlunos() {
        return alunos;
    }

    public void setAlunos(List<Aluno> alunos) {
        this.alunos = alunos;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
}
