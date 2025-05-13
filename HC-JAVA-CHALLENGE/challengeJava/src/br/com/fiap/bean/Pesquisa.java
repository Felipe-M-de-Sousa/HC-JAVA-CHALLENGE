package br.com.fiap.bean;

public class Pesquisa {
    public VideoTutorial buscarPorTitulo(VideoTutorial[] lista, String palavra) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].getTitulo().toLowerCase().contains(palavra.toLowerCase())) {
                return lista[i];
            }
        }
        return null;
    }

    public VideoTutorial buscarPorURL(VideoTutorial[] lista, String url) {
        for (int i = 0; i < lista.length; i++) {
            if (lista[i] != null && lista[i].getUrl().equals(url)) {
                return lista[i];
            }
        }
        return null;
    }
}