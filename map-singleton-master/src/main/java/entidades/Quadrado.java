package entidades;

public class Quadrado {
    private int id;

    public Quadrado(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Quadrado: " + this.id;
    }
}
