import entidades.Circulo;
import entidades.Quadrado;
import entidades.Triangulo;
import enums.TrianguloTipos;

public class FormasFactory {
    
    private FormasFactory() {}

    public static Circulo getCirculo() {
        return Circulo.getInstance();
    }

    public static Quadrado getQuadrado() {
        return Quadrado.getInstance();
    }

    public static Triangulo getTriangulo(TrianguloTipos tipo) {
        return Triangulo.getInstance(tipo);
    }

    public static int getQuantidadeDeInstanciasTriangulos() {
        return Triangulo.getQuantidadeDeInstanciasTriangulos();
    }

    public static int getQuantidadeDeInstanciasQuadrados() {
        return Quadrado.getQuantidadeDeInstanciasQuadrados();
    }

}
