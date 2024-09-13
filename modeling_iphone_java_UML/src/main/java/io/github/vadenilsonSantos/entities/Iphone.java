package io.github.vadenilsonSantos.entities;

import io.github.vadenilsonSantos.interfaces.AparelhoTelefonico;
import io.github.vadenilsonSantos.interfaces.NavegadorInternet;
import io.github.vadenilsonSantos.interfaces.ReprodutorMusical;

public class Iphone implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {

    @Override
    public void tocar(){
        System.out.println("Tocando musica.");
    }
    @Override
    public void pausar(){
        System.out.println("Pausando musica.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando a musica: " + musica + ".");
    }

    //Aparelho Telefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero + ".");
    }

    @Override
    public void atender() {
        System.out.println("Atendo ligação.");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz.");
    }

    //Navegador de internet

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página.");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova aba.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página.");
    }
}
