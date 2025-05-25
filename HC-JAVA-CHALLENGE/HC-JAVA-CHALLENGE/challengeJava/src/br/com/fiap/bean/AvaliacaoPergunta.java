package br.com.fiap.bean;

public class AvaliacaoPergunta {
    private Pergunta pergunta;
    private int curtidas;

    public AvaliacaoPergunta() {
        this.curtidas = 0;
    }

    public AvaliacaoPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
        this.curtidas = 0;
    }

    public void curtir() {
        curtidas++;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public Pergunta getPergunta() {
        return pergunta;
    }

    public void setPergunta(Pergunta pergunta) {
        this.pergunta = pergunta;
    }
}