package entidades;

public class Circulo {

    private int id;
    private static Circulo circuloIstance = null;

    private Circulo(int id) {
        this.id = id;
    }
    
    public static Circulo getInstance() {
        if(circuloIstance != null) {
            return circuloIstance;
        }

        return new Circulo(1);
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Circulo: " + this.id;
    }
}
