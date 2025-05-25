package br.com.fiap.bean;

public class Feedback {
    private Usuario usuario;
    private VideoTutorial video;
    private boolean gostou;

    public Feedback() {
    }

    public Feedback(Usuario usuario, VideoTutorial video, boolean gostou) {
        this.usuario = usuario;
        this.video = video;
        this.gostou = gostou;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public VideoTutorial getVideo() {
        return video;
    }

    public void setVideo(VideoTutorial video) {
        this.video = video;
    }

    public void registrarFeedback(boolean gostou) {
        this.gostou = gostou;
    }

    public boolean foiPositivo() {
        return gostou;
    }
}