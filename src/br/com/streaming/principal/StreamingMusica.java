package br.com.streaming.principal;

import br.com.streaming.modelo.*;

public class StreamingMusica {

    public static void main(String[] args) {

        Musica m1 =
                new Musica(
                        "Evidências",
                        "Chitãozinho",
                        200
                );

        Musica m2 =
                new Musica(
                        "Tempo Perdido",
                        "Legião Urbana",
                        300
                );

        Playlist playlist =
                new Playlist("Favoritas");

        playlist.adicionarMusica(m1);
        playlist.adicionarMusica(m2);

        UsuarioFree free =
                new UsuarioFree(
                        "Ana",
                        "ana@email.com"
                );

        UsuarioPremium premium =
                new UsuarioPremium(
                        "Carlos",
                        "carlos@email.com"
                );

        free.exibir();

        premium.exibir();

        premium.baixar(m1);

        playlist.reproduzir();

        System.out.println(
                "Total downloads: "
                        + premium.getTamanhoBaixados()
        );
    }
}