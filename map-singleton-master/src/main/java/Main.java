import entidades.Circulo;
import entidades.Quadrado;
import entidades.Triangulo;
import enums.TrianguloTipos;

public class Main {
    public static void main(String[] args) {
        Circulo circulo1 = FormasFactory.getCirculo();
        Circulo circulo2 = FormasFactory.getCirculo();

        System.out.println("Circulos: ");
        System.out.println(circulo1);
        System.out.println(circulo2);
        System.out.println();

        Triangulo trianguloEquilatero1 = FormasFactory.getTriangulo(TrianguloTipos.Equilatero);
        Triangulo trianguloIsoceles1 = FormasFactory.getTriangulo(TrianguloTipos.Isoceles);
        Triangulo trianguloRetangulo1 = FormasFactory.getTriangulo(TrianguloTipos.Retangulo);

        Triangulo trianguloEquilatero2 = FormasFactory.getTriangulo(TrianguloTipos.Equilatero);
        Triangulo trianguloIsoceles2 = FormasFactory.getTriangulo(TrianguloTipos.Isoceles);
        Triangulo trianguloRetangulo2 = FormasFactory.getTriangulo(TrianguloTipos.Retangulo);

        System.out.println("Triângulos: ");
        System.out.println(trianguloEquilatero1);
        System.out.println(trianguloEquilatero2);
        System.out.println(trianguloIsoceles1);
        System.out.println(trianguloIsoceles2);
        System.out.println(trianguloRetangulo1);
        System.out.println(trianguloRetangulo2);
        System.out.println("Quantidade de triângulos criados: " + FormasFactory.getQuantidadeDeInstanciasTriangulos());
        System.out.println();

        Quadrado quadrado1 = FormasFactory.getQuadrado();
        Quadrado quadrado2 = FormasFactory.getQuadrado();
        Quadrado quadrado3 = FormasFactory.getQuadrado();
        Quadrado quadrado4 = FormasFactory.getQuadrado();
        Quadrado quadrado5 = FormasFactory.getQuadrado();

        System.out.println("Quandrados: ");
        System.out.println(quadrado1);
        System.out.println(quadrado2);
        System.out.println(quadrado3);
        System.out.println(quadrado4);
        System.out.println(quadrado5);
        System.out.println("Quantidade de retângulos criadas: " + FormasFactory.getQuantidadeDeInstanciasQuadrados());
    }
}
