package main.erros;

public class NumeroNegativoException extends RuntimeException {

    public NumeroNegativoException(String mensage){
        super(mensage);
    }
}
