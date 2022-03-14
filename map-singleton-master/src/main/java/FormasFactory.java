import entidades.Circulo;
import entidades.Quadrado;
import entidades.Triangulo;
import enums.TrianguloTipos;

import java.util.HashMap;

public class FormasFactory {
    private static Circulo circuloInstance = null;
    private static int quadradoIntancias = 0;
    private static HashMap<TrianguloTipos, Triangulo> trianguloInstances = new HashMap<>();

    private FormasFactory() {}

    public static Circulo getCirculo() {
        if(circuloInstance != null) {
            return circuloInstance;
        }

        circuloInstance = new Circulo(1);
        return circuloInstance;
    }

    public static Quadrado getQuadrado() {
        quadradoIntancias += 1;
        return new Quadrado(quadradoIntancias);
    }

    public static Triangulo getTriangulo(TrianguloTipos tipo) {
        Triangulo triangulo = trianguloInstances.get(tipo);

        if(triangulo != null) {
            return triangulo;
        }

        triangulo = new Triangulo(1, tipo);
        trianguloInstances.put(tipo, triangulo);
        return triangulo;
    }

    public static int getQuantidadeDeInstanciasTriangulos() {
        return trianguloInstances.size();
    }

    public static int getQuantidadeDeInstanciasQuadrados() {
        return quadradoIntancias;
    }

}
