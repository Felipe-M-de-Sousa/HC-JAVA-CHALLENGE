package br.com.fiap.bean;

public class Ajuda {
    private String pergunta;
    private String resposta;

    public Ajuda() {
    }

    public Ajuda(String pergunta, String resposta) {
        this.pergunta = pergunta;
        this.resposta = resposta;
    }

    public String getPergunta() {
        return pergunta;
    }

    public void setPergunta(String pergunta) {
        this.pergunta = pergunta;
    }

    public String getResposta() {
        return resposta;
    }

    public void setResposta(String resposta) {
        this.resposta = resposta;
    }

    public void exibirResposta() {
        System.out.println(resposta);
    }

    public boolean contemPalavraChave(String palavra) {
        return pergunta != null && palavra != null &&
                pergunta.toLowerCase().contains(palavra.toLowerCase());
    }
}