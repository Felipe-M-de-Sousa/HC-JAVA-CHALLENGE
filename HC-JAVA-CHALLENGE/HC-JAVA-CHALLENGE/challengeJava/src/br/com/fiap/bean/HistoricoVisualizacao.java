package br.com.fiap.bean;

import java.time.LocalDateTime;

public class HistoricoVisualizacao {
    private Usuario usuario;
    private VideoTutorial video;
    private LocalDateTime dataHora;

    public HistoricoVisualizacao() {
    }

    public HistoricoVisualizacao(Usuario usuario, VideoTutorial video) {
        this.usuario = usuario;
        this.video = video;
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

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public void setDataHora(LocalDateTime dataHora) {
        this.dataHora = dataHora;
    }

    public void registrarVisualizacao() {
        this.dataHora = LocalDateTime.now();
    }

    public boolean foiAssistidoHoje() {
        return dataHora != null &&
                dataHora.toLocalDate().equals(LocalDateTime.now().toLocalDate());
    }
}
