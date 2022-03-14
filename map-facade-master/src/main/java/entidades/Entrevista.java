package entidades;

public class Entrevista {
    String id;
    String horario;

    public Entrevista(String id, String horario) {
        this.id = id;
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Entrevista " + this.id + " - " + this.horario;
    }
}
