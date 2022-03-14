package entidades;

import java.util.List;

public class RDM {
    String id;
    String idAluno;
    List<String> disciplinasMatriculadas;

    public RDM(String id, String idAluno, List<String> disciplinasMatriculadas) {
        this.id = id;
        this.idAluno = idAluno;
        this.disciplinasMatriculadas = disciplinasMatriculadas;
    }

    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder();
        builder.append("RDM de ID ");
        builder.append(this.id);
        builder.append(" - ");
        builder.append("Aluno com ID: ");
        builder.append(this.idAluno + " - ");
        builder.append("Matriculado em: ");
        builder.append(this.disciplinasMatriculadas.toString());

        return builder.toString();
    }
}
