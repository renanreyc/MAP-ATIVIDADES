package main.funcoes;

public enum ListaFuncoes {

    ATOR("Ator"),
    DIRETOR("Diretor"),
    PRODUTOR("Produtor"),
    ELENCO("Elecon"),
    TRILHASONORA("Trilha Sonora"),
    CAMERA("Camera"),
    CINEGRAFISTA("Cinegrafista"),
    ROTEIRISTA("Roteirista");

    private String nome;


    ListaFuncoes(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }
}