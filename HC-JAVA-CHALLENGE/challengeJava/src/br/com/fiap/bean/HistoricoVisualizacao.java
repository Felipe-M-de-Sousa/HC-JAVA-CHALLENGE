package br.com.fiap.bean;

import java.time.LocalDateTime;

public class HistoricoVisualizacao {
    private Usuario usuario;
    private VideoTutorial video;
    private LocalDateTime dataHora;

    public void registrarVisualizacao() {
        this.dataHora = LocalDateTime.now();
    }

    public boolean foiAssistidoHoje() {
        return dataHora.toLocalDate().equals(LocalDateTime.now().toLocalDate());
    }
}