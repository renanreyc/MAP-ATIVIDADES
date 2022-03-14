package entidades;

public class Sala {
    String id;
    String status;
    String horario;

    public Sala(String id, String status, String horario) {
        this.id = id;
        this.status = status;
        this.horario = horario;
    }

    @Override
    public String toString() {
        return "Sala " + this.id + " - " + this.status + " - " + this.horario;
    }
}
