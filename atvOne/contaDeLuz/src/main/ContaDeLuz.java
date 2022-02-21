package main;

public class ContaDeLuz {
    static int numeroDeLeituras = 1;

    private int numDaLeitura;
    private String dataDeLeitura;
    private int kiloWattsGastos;
    private double valorContaLuz;

    //Constructor
    public ContaDeLuz(String dataDeLeitura, int kiloWattsGastos) throws Exception{
        if (dataDeLeitura.isEmpty()) {
            throw new Exception("Data inválida.");
        }
        if(kiloWattsGastos < 0){
            throw new Exception("kiloWatts inválido. Número negativo.");
        }

        this.numDaLeitura = ContaDeLuz.numeroDeLeituras++;
        this.dataDeLeitura = dataDeLeitura;
        this.kiloWattsGastos = kiloWattsGastos;
    }

    public String getDataDeLeitura() {
        return dataDeLeitura;
    }

    public void setDataDeLeitura(String dataDeLeitura) {
        this.dataDeLeitura = dataDeLeitura;
    }

    public int getNumDaLeitura() {
        return numDaLeitura;
    }

    public int getKiloWattsGastos() {
        return kiloWattsGastos;
    }

    public void setKiloWattsGastos(int kiloWattsGastos) {
        this.kiloWattsGastos = kiloWattsGastos;
    }

    public double getValorContaLuz() {
        this.valorContaLuz = getKiloWattsGastos() * 0.5;
        return this.valorContaLuz;
    }

    @Override
    public String toString() {
        return "###Conta De Luz###" +
                "\nNum Da Leitura: " + numDaLeitura +
                "\nData De Leitura: " + dataDeLeitura +
                "\nKiloWatts Gastos: " + kiloWattsGastos +
                "\nValor da Conta de Luz: R$" + getValorContaLuz();
    }
}
