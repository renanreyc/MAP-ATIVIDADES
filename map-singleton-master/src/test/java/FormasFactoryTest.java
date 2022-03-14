import entidades.Circulo;
import entidades.Triangulo;
import enums.TrianguloTipos;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FormasFactoryTest {

    @Test
    void criaApenasUmaInstanciaDeCirculo() {
        FormasFactory.getCirculo();
        Circulo circulo2 = FormasFactory.getCirculo();
        Assertions.assertEquals(1, circulo2.getId());
    }

    @Test
    void criaQuantidadeDeQuadradosCorretamente() {
      FormasFactory.getQuadrado();
      FormasFactory.getQuadrado();
      Assertions.assertEquals(2, FormasFactory.getQuantidadeDeInstanciasQuadrados());
    }

    @Test
    void criouApenasUmaInstanciaDeCadaTriangulo() {
        FormasFactory.getTriangulo(TrianguloTipos.Isoceles);
        FormasFactory.getTriangulo(TrianguloTipos.Isoceles);
        FormasFactory.getTriangulo(TrianguloTipos.Retangulo);
        FormasFactory.getTriangulo(TrianguloTipos.Equilatero);
        Assertions.assertEquals(3, FormasFactory.getQuantidadeDeInstanciasTriangulos());
    }

    @Test
    void criaUmTrianguloIsoscelesCorretamente() {
        Triangulo triangulo = FormasFactory.getTriangulo(TrianguloTipos.Isoceles);
        Assertions.assertEquals(TrianguloTipos.Isoceles, triangulo.getTipo());
    }
    @Test
    void criaUmTrianguloEquilateroCorretamente() {
        Triangulo triangulo = FormasFactory.getTriangulo(TrianguloTipos.Equilatero);
        Assertions.assertEquals(TrianguloTipos.Equilatero, triangulo.getTipo());
    }
    @Test
    void criaUmTrianguloRetanguloCorretamente() {
        Triangulo triangulo = FormasFactory.getTriangulo(TrianguloTipos.Retangulo);
        Assertions.assertEquals(TrianguloTipos.Retangulo, triangulo.getTipo());
    }

    @Test
    void getQuantidadeDeInstanciasPorTipoEquilatero() {
        FormasFactory.getTriangulo(TrianguloTipos.Equilatero);
        Triangulo triangulo2 = FormasFactory.getTriangulo(TrianguloTipos.Equilatero);
        Assertions.assertEquals(1, triangulo2.getId());
    }
    @Test
    void getQuantidadeDeInstanciasPorTipoIsoceles() {
        FormasFactory.getTriangulo(TrianguloTipos.Isoceles);
        Triangulo triangulo2 = FormasFactory.getTriangulo(TrianguloTipos.Isoceles);
        Assertions.assertEquals(1, triangulo2.getId());
    }
    @Test
    void getQuantidadeDeInstanciasPorTipoRetangulo() {
        FormasFactory.getTriangulo(TrianguloTipos.Retangulo);
        Triangulo triangulo2 = FormasFactory.getTriangulo(TrianguloTipos.Retangulo);
        Assertions.assertEquals(1, triangulo2.getId());
    }

}