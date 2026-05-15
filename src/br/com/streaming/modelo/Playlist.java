package br.com.streaming.modelo;

import br.com.streaming.servico.Reproduzivel;

import java.util.ArrayList;

public class Playlist extends ItemReproducao
        implements Reproduzivel {

    protected ArrayList<Musica> musicas =
            new ArrayList<>();

    public Playlist(String titulo) {

        super(titulo);
    }

    public void adicionarMusica(Musica musica) {

        musicas.add(musica);
    }

    @Override
    public void reproduzir() {

        System.out.println("Playlist: " + titulo);

        for (Musica m : musicas) {
            m.reproduzir();
        }
    }

    @Override
    public void pausar() {
        System.out.println("Playlist pausada");
    }

    @Override
    public void parar() {
        System.out.println("Playlist parada");
    }

    @Override
    public int getDuracaoTotal() {

        int total = 0;

        for (Musica m : musicas) {
            total += m.getDuracaoTotal();
        }

        return total;
    }
}