package br.com.fiap.bean;

public class Usuario {
    private String nome;
    private int idade;

    // Construtor
    public Usuario(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    // Método para assistir vídeo
    public void assistirVideo(VideoTutorial video) {
        video.assistir();  // usa o método assistir para incrementar visualizações
        System.out.println("Assistindo: " + video.getTitulo());
    }
}