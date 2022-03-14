package entidades;

import java.util.List;

public class Historico {

    private String id;
    private String idAluno;
    private List<String> disciplinasRealizadas;

    public Historico(String id, String idAluno, List<String> disciplinasRealizadas) {
        this.id = id;
        this.idAluno = idAluno;
        this.disciplinasRealizadas = disciplinasRealizadas;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("Historico de ID ");
        builder.append(this.id);
        builder.append(" - ");
        builder.append("Aluno com ID: ");
        builder.append(this.idAluno + " - ");
        builder.append("Matriculado em: ");
        builder.append(this.disciplinasRealizadas.toString());

        return builder.toString();
    }
}
