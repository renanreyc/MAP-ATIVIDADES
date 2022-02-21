package main;

import main.figuras.*;

public class Geometria {

    public static Quadrado criarQuadrado(int lado) {
        return new Quadrado(lado);
    }

    public static Retangulo criarRetangulo(int altura, int largura) {
        return new Retangulo(largura, altura);
    }

    public static Circulo criarCirculo(int raio) {
        return new Circulo(raio);
    }
}
