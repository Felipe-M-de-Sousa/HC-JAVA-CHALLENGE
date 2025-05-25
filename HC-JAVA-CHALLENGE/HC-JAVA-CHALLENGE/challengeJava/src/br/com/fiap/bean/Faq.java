package br.com.fiap.bean;

public class Faq {
    private Pergunta[] faqs = new Pergunta[10];
    private int count = 0;

    public void carregarFaqs() {
        faqs[0] = new Pergunta("O que é Java?", "Java é uma linguagem de programação.");
        faqs[1] = new Pergunta("O que é PO?", "PO é Programação Orientada a Objetos.");
        count = 2;
    }

    public Pergunta[] getFaqs() {
        return faqs;
    }

    public int getCount() {
        return count;
    }
}