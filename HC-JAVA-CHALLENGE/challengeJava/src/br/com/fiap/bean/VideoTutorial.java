package br.com.fiap.bean;

public class VideoTutorial {
    private String titulo;
    private String descricao;
    private String url;
    private int visualizacoes;
    private int curtidas;

    // Construtor com três parâmetros
    public VideoTutorial(String titulo, String descricao, String url) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.url = url;
        this.visualizacoes = 0;
        this.curtidas = 0;
    }

    // Getters
    public String getTitulo() {
        return titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public String getUrl() {
        return url;
    }

    public int getVisualizacoes() {
        return visualizacoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    // Métodos de interação
    public void assistir() {
        visualizacoes++;
    }

    public void curtir() {
        curtidas++;
    }

    // Método para incrementar visualizações
    public void incrementarVisualizacoes() {
        this.visualizacoes++;
    }
}