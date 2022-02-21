package main.figuras;

public class Quadrado extends FiguraBase {

    public Quadrado(int lado) {
        super("quadrado", "lado", lado);
    }

    @Override
    public String perimetro() {
        double perimetro = 4 * getValue();
        return this.getPerimetroMessage(perimetro);
    }

    @Override
    public String area() {
        double area = getValue() * getValue();
        return this.getAreaMessage(area);
    }
}
