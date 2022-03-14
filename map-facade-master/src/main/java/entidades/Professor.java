package entidades;

public class Professor {
    private String id;
    private String nome;
    private String disciplina;
    private String tempoDeCasa;

    public Professor(String id, String nome, String disciplina, String tempoDeCasa) {
        this.id = id;
        this.nome = nome;
        this.disciplina = disciplina;
        this.tempoDeCasa = tempoDeCasa;
    }

    public String getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getDisciplina() {
        return disciplina;
    }

    public String getTempoDeCasa() {
        return tempoDeCasa;
    }

    @Override
        public String toString() {
        StringBuilder builder = new StringBuilder();

            builder.append(this.nome);
            builder.append(" - ");
            builder.append("Disciplina: ");
            builder.append(this.disciplina);
            builder.append(" - ");
            builder.append("Tempo de casa: ");
            builder.append(this.tempoDeCasa);
            return builder.toString();
        }

}
