package br.com.fiap.bean;

public class Feedback {
    private Usuario usuario;
    private VideoTutorial video;
    private boolean gostou;

    public void registrarFeedback(boolean gostou) {
        this.gostou = gostou;
    }

    public boolean foiPositivo() {
        return gostou;
    }
}