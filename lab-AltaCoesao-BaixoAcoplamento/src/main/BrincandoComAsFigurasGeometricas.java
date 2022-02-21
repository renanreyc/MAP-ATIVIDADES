package main;

import main.figuras.Circulo;
import main.figuras.Figura;
import main.figuras.Quadrado;
import main.figuras.Retangulo;

import java.util.ArrayList;
import java.util.List;

public class BrincandoComAsFigurasGeometricas {

    public static void main(String[] args) {

        Retangulo retangulo = Geometria.criarRetangulo(10, 5);
        Quadrado quadrado = Geometria.criarQuadrado(7);
        Circulo circulo = Geometria.criarCirculo(25);

        List<Figura> figuras = new ArrayList<>() {
            {
                add(retangulo);
                add(quadrado);
                add(circulo);
            }
        };

        for (Figura figura : figuras) {
            imprimir(figura.perimetro());
            imprimir(figura.area());
            imprimir(figura.toString());
            imprimir("");
        }
    }

    public static void imprimir(String msg) {
        System.out.println(msg);
    }
}
