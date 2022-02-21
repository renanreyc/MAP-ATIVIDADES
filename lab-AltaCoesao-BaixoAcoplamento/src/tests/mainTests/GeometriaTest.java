package tests.mainTests;

import tests.builders.CirculoBuilder;
import tests.builders.QuadradoBuilder;
import tests.builders.RetanguloBuilder;
import main.Geometria;
import main.erros.NumeroNegativoException;
import main.figuras.Circulo;
import main.figuras.Quadrado;
import main.figuras.Retangulo;
import static org.junit.Assert.assertEquals;
import org.junit.Before;
import org.junit.Test;

public class GeometriaTest {
    private Quadrado quadradoBuilder;
    private Circulo circuloBuilder;
    private Retangulo retanguloBuilder;

    @Before
    public void setUp(){
        this.quadradoBuilder =  QuadradoBuilder.mockQuadrado().getQuadrado();
        this.circuloBuilder = CirculoBuilder.mockCirculo().getCirculo();
        this.retanguloBuilder = RetanguloBuilder.mockRetangulo().getRetangulo();
    }

    @Test
    public void testCriarQuadrado(){
        Quadrado quadrado = Geometria.criarQuadrado(5);
        assertEquals(quadrado.area(), this.quadradoBuilder.area());
        assertEquals(quadrado.perimetro(), this.quadradoBuilder.perimetro());
    }

    @Test(expected = NumeroNegativoException.class)
    public void testCriarQuadradoException(){
        Quadrado quadrado = Geometria.criarQuadrado(-5);
    }

    @Test
    public void testCriarRetangulo(){
        Retangulo retangulo = Geometria.criarRetangulo(5, 3);
        assertEquals(retangulo.area(), this.retanguloBuilder.area());
        assertEquals(retangulo.perimetro(), this.retanguloBuilder.perimetro());
    }

    @Test(expected = NumeroNegativoException.class)
    public void testCriarRetanguloException(){
        Retangulo retangulo = Geometria.criarRetangulo(5, -3);
    }

    @Test
    public void testCriarCirculo(){
        Circulo circulo = Geometria.criarCirculo(5);
        assertEquals(circulo.area(), this.circuloBuilder.area());
        assertEquals(circulo.perimetro(), this.circuloBuilder.perimetro());
    }

    @Test(expected = NumeroNegativoException.class)
    public void testCriarCirculoException(){
        Circulo circulo = Geometria.criarCirculo(-5);
    }
}
