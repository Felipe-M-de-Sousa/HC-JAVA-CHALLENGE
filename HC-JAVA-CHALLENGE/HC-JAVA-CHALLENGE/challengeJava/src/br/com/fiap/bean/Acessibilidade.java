package br.com.fiap.bean;

public class Acessibilidade {
    private int tamanhoFonte = 12;  // valor inicial padrão
    private boolean altoContraste = false;

    public void aumentarFonte() {
        if (tamanhoFonte < 36) {
            tamanhoFonte++;
        }
    }

    public void diminuirFonte() {
        if (tamanhoFonte > 8) {
            tamanhoFonte--;
        }
    }

    public void ativarAltoContraste() {
        altoContraste = true;
    }

    public void desativarAltoContraste() {
        altoContraste = false;
    }

    public int getTamanhoFonte() {
        return tamanhoFonte;
    }

    public boolean isAltoContraste() {
        return altoContraste;
    }
}