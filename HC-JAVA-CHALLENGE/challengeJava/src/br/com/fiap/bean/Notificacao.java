package br.com.fiap.bean;

public class Notificacao {
    private String mensagem;
    private String destinatarioEmail;

    public void enviarEmail() {
        System.out.println("Enviado para: " + destinatarioEmail);
    }

    public void atualizarMensagem(String novaMensagem) {
        this.mensagem = novaMensagem;
    }
}