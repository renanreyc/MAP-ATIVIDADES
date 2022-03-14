package entidades;

public class Reuniao {

    private String id;
    private String horario;

    public Reuniao(String id, String horario) {
        this.id = id;
        this.horario = horario;
    }

    public String getId() {
        return id;
    }

    public String getHorario() {
        return horario;
    }

    @Override
    public String toString() {
        return "Reuniao " + this.id + " - " + this.horario;
    }
}
