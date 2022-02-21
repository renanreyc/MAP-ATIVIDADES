package main;

public class Main {
    public static void main(String[] args) throws Exception {
        ContaDeLuz contaDeLuzOut = new ContaDeLuz("07/10/2021",150);
        ContaDeLuz contaDeLuzNov = new ContaDeLuz("05/11/2021",100);
        ContaDeLuz contaDeLuzDez = new ContaDeLuz("10/12/2021",300);

        System.out.println(contaDeLuzOut.toString());

        System.out.println();
        System.out.println("Informações Novembro: ");
        imprimirNumdaLeitura(contaDeLuzNov);
        imprimirDataDaLeitura(contaDeLuzNov);
        imprimirKiloWattsGastos(contaDeLuzNov);
        imprimirContaDeLuz(contaDeLuzNov);
        System.out.println();
        System.out.println("Informações Dezembro: ");
        imprimirNumdaLeitura(contaDeLuzDez);
        imprimirDataDaLeitura(contaDeLuzDez);
        imprimirKiloWattsGastos(contaDeLuzDez);
        imprimirContaDeLuz(contaDeLuzDez);
    }

    static void imprimirNumdaLeitura(ContaDeLuz contaDeLuz){
        System.out.println("Número da leitura: " + contaDeLuz.getNumDaLeitura());
    }

    static void imprimirDataDaLeitura(ContaDeLuz contaDeLuz){
        System.out.println("Data da Leitura: " + contaDeLuz.getDataDeLeitura());
    }

    static void imprimirContaDeLuz(ContaDeLuz contaDeLuz){
        System.out.println("Conta de Luz: R$" + contaDeLuz.getValorContaLuz());
    }

    static void imprimirKiloWattsGastos(ContaDeLuz contaDeLuz){
        System.out.println("Kilowatts gastos no mês: " + contaDeLuz.getKiloWattsGastos() + "Kw");
    }
}
