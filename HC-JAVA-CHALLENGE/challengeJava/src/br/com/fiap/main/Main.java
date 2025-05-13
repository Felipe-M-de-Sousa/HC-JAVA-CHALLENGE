package br.com.fiap.main;

import br.com.fiap.bean.*;

public class Main {
    public static void main(String[] args) {
        // Criando vídeos
        VideoTutorial video1 = new VideoTutorial("Java Básico", "Introdução ao Java", "url1");
        VideoTutorial video2 = new VideoTutorial("Java Avançado", "Técnicas avançadas em Java", "url2");

        // Criando usuário
        Usuario usuario = new Usuario("João", 25);

        // Usuário assiste ao vídeo 1
        usuario.assistirVideo(video1);
        System.out.println("Visualizações do vídeo '" + video1.getTitulo() + "': " + video1.getVisualizacoes());

        // Usuário assiste ao vídeo 2
        usuario.assistirVideo(video2);
        System.out.println("Visualizações do vídeo '" + video2.getTitulo() + "': " + video2.getVisualizacoes());
    }
}