package entidades;

public class Quadrado {
    private int id;
    private static int quadradoIntancias = 0;

    private Quadrado(int id) {
        this.id = id;
    }

    public static Quadrado getInstance() {
        Quadrado.quadradoIntancias += 1;
        return new Quadrado(quadradoIntancias);
    }

    public static int getQuantidadeDeInstanciasQuadrados(){
        return Quadrado.quadradoIntancias;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Quadrado: " + this.id;
    }
}
