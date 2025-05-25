package br.com.fiap.bean;

public class Notificacao {
    private String mensagem;
    private String destinatarioEmail;

    // Construtor para inicializar os campos
    public Notificacao(String mensagem, String destinatarioEmail) {
        this.mensagem = mensagem;
        this.destinatarioEmail = destinatarioEmail;
    }

    // Getters e Setters
    public String getMensagem() {
        return mensagem;
    }

    public void setMensagem(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getDestinatarioEmail() {
        return destinatarioEmail;
    }

    public void setDestinatarioEmail(String destinatarioEmail) {
        this.destinatarioEmail = destinatarioEmail;
    }

    // Método para enviar email (simulado)
    public void enviarEmail() {
        if(destinatarioEmail == null || destinatarioEmail.isEmpty()) {
            System.out.println("Erro: destinatário inválido.");
            return;
        }
        System.out.println("Enviando para: " + destinatarioEmail);
        System.out.println("Mensagem: " + mensagem);
    }

    // Atualiza mensagem
    public void atualizarMensagem(String novaMensagem) {
        this.mensagem = novaMensagem;
    }
}