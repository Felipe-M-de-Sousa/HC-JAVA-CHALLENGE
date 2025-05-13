package br.com.fiap.bean;

public class Ajuda {
    private String pergunta;
    private String resposta;

    public void exibirResposta() {
        System.out.println(resposta);
    }

    public boolean contemPalavraChave(String palavra) {
        return pergunta.toLowerCase().contains(palavra.toLowerCase());
    }
}