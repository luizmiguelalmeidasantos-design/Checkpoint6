package br.com.streaming.modelo;

import br.com.streaming.servico.Baixavel;

import java.util.ArrayList;

public class UsuarioPremium extends Usuario
        implements Baixavel {

    private ArrayList<Musica> downloads =
            new ArrayList<>();

    public UsuarioPremium(
            String nome,
            String email
    ) {

        super(nome, email);
    }

    @Override
    public void baixar(Musica musica) {

        downloads.add(musica);

        System.out.println(
                "Download realizado"
        );
    }

    @Override
    public void removerDownload(Musica musica) {

        downloads.remove(musica);
    }

    @Override
    public boolean estaBaixada(Musica musica) {

        return downloads.contains(musica);
    }

    @Override
    public int getTamanhoBaixados() {

        return downloads.size();
    }

    @Override
    public void exibir() {

        System.out.println(
                nome + " (Premium)"
        );
    }
}