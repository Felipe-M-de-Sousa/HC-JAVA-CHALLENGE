package br.com.fiap.main;

import br.com.fiap.bean.*;
import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        // Pedir nome do usuário
        String nome = JOptionPane.showInputDialog(null, "Digite seu nome:");

        // Pedir idade e converter para int
        String idadeStr = JOptionPane.showInputDialog(null, "Digite sua idade:");
        int idade = 0;
        try {
            idade = Integer.parseInt(idadeStr);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Idade inválida! Usando idade 0.");
        }

        Usuario user = new Usuario(nome, idade);

        // Pedir título do vídeo
        String titulo = JOptionPane.showInputDialog(null, "Digite o título do vídeo:");

        // Pedir descrição do vídeo
        String descricao = JOptionPane.showInputDialog(null, "Digite a descrição do vídeo:");

        // Criar vídeo com URL fixo só pra exemplo
        VideoTutorial video = new VideoTutorial(titulo, descricao, "http://exemplo.com/video");

        // Usuário assiste o vídeo
        user.assistirVideo(video);

        // Curtir o vídeo
        video.curtir();

        // Mostrar resultados numa mensagem
        String mensagem = "Usuário: " + user.getNome() +
                "\nIdade: " + user.getIdade() +
                "\nVídeo assistido: " + video.getTitulo() +
                "\nVisualizações: " + video.getVisualizacoes() +
                "\nCurtidas: " + video.getCurtidas();

        JOptionPane.showMessageDialog(null, mensagem);

        // Criar administrador (dados fixos só para exemplo)
        Administrador admin = new Administrador();

        // Simular adicionar vídeo
        admin.adicionarVideo(video);

        // Simular remover vídeo
        admin.removerVideo(video);

        // Exemplo de notificação
        Notificacao not = new Notificacao("Obrigado por assistir!", nome + "@exemplo.com");
        not.enviarEmail();

        // Histórico
        HistoricoVisualizacao historico = new HistoricoVisualizacao(user, video);
        historico.registrarVisualizacao();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String dataFormatada = historico.getDataHora().format(formatter);

        JOptionPane.showMessageDialog(null, "Visualização registrada em: " + dataFormatada);
    }
}