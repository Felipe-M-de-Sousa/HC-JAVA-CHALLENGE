package br.com.fiap.bean;

public class Categoria {
    private String nome;
    private VideoTutorial[] videos;
    private int indice = 0;

    public Categoria(String nome, int capacidade) {
        this.nome = nome;
        this.videos = new VideoTutorial[capacidade];
    }

    public void adicionarVideo(VideoTutorial video) {
        if (indice < videos.length) {
            videos[indice++] = video;
            System.out.println("Vídeo adicionado à categoria: " + nome);
        } else {
            System.out.println("Capacidade máxima de vídeos atingida.");
        }
    }

    public void listarVideos() {
        System.out.println("Vídeos na categoria " + nome + ":");
        for (int i = 0; i < indice; i++) {
            System.out.println("- " + videos[i].getTitulo());
        }
    }
}