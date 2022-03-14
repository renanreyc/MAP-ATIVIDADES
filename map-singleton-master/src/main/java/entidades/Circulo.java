package entidades;

public class Circulo {
    private int id;

    public Circulo(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Circulo: " + this.id;
    }
}
