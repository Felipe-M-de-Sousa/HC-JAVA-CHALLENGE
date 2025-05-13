package br.com.fiap.bean;

public class Usuario {
    private String nome;
    private int idade;

    // Construtor
    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Método para assistir vídeo
    public void assistirVideo(VideoTutorial video) {
        video.incrementarVisualizacoes();
        System.out.println("Assistindo: " + video.getTitulo());
    }
}