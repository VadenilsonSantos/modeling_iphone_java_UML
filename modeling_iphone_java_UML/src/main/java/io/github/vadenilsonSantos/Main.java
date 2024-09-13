package io.github.vadenilsonSantos;

import io.github.vadenilsonSantos.entities.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        // Testes do Reprodutor Musical
        System.out.println("#__________Reprodutor Musical__________#");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Bohemian Rhapsody");

        // Testes do Aparelho Telefônico
        System.out.println("#__________Aparelho Telefônico__________#");
        iphone.ligar("(12)3456-7890");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        // Testes do Navegador na Internet
        System.out.println("#_________Navegador de Internet_________#");
        iphone.exibirPagina("https://www.example.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }
}