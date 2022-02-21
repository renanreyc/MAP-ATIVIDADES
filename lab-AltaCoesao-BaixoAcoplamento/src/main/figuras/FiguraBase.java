package main.figuras;

import main.erros.NumeroNegativoException;

public abstract class FiguraBase implements Figura {

    private final String name;
    private final String fieldName;
    private final int fieldValue;

    public FiguraBase(String name, String field, int value) {
        if (value < 0) {
            throw new NumeroNegativoException("O valor do " + field + " do " + name + " não pode ser negativo");
        }
        this.name = name;
        this.fieldName = field;
        this.fieldValue = value;
    }

    @Override
    public String toString() {
        return "O " + name + " criado tem " + fieldName + " de tamanho: " + fieldValue;
    }

    protected String getPerimetroMessage(double perimetro) {
        return "O perímetro do " + name + " é: " + perimetro;
    }

    protected String getAreaMessage(double area) {
        return "A área deste " + name + " é: " + area;
    }

    public String getName() {
        return name;
    }

    public String getField() {
        return fieldName;
    }

    public int getValue() {
        return fieldValue;
    }
}
