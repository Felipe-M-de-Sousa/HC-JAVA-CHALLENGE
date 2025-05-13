package br.com.fiap.bean;

public class Administrador {
    private String nome;
    private String email;

    public void adicionarVideo(VideoTutorial video) {
        System.out.println("Vídeo adicionado: " + video.getTitulo());
    }

    public void removerVideo(VideoTutorial video) {
        System.out.println("Vídeo removido: " + video.getTitulo());
    }
}