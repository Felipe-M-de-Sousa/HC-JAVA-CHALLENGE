package br.com.fiap.bean;

public class Acessibilidade {
    private int tamanhoFonte;
    private boolean altoContraste;

    public void aumentarFonte() {
        tamanhoFonte++;
    }

    public void diminuirFonte() {
        tamanhoFonte--;
    }

    public void ativarAltoContraste() {
        altoContraste = true;
    }
}