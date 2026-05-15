package br.com.streaming.modelo;

import br.com.streaming.servico.Reproduzivel;

public class Musica extends ItemReproducao
        implements Reproduzivel {

    private String artista;
    private int duracao;

    public Musica(
            String titulo,
            String artista,
            int duracao
    ) {

        super(titulo);

        this.artista = artista;
        this.duracao = duracao;
    }

    @Override
    public void reproduzir() {
        System.out.println("Tocando música: " + titulo);
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void parar() {
        System.out.println("Música parada");
    }

    @Override
    public int getDuracaoTotal() {
        return duracao;
    }
}