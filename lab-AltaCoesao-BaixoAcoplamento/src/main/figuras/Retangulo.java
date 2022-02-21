package main.figuras;

import main.erros.NumeroNegativoException;

public class Retangulo extends FiguraBase {

    private final int largura;

    public Retangulo(int largura, int altura) {
        super("retangulo", "altura", altura);
        if(largura < 0) { throw new NumeroNegativoException("O valor da largura é de: " + largura + ". O valor não pode ser negativo"); }
        this.largura = largura;
    }

    @Override
    public String perimetro() {
        double perimetro = (2 * this.getValue()) + (2 * largura);
        return this.getPerimetroMessage(perimetro);
    }

    @Override
    public String area() {
        double area = this.getValue() * largura;
        return this.getAreaMessage(area);
    }

    @Override
    public String toString() {
        return "O " + this.getName() + " criado tem " + this.getField() + " de tamanho: " + this.getValue() + " e largura de tamanho: " + largura;
    }

    public int getLargura() {
        return largura;
    }
}
