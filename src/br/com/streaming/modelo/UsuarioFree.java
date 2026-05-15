package br.com.streaming.modelo;

public class UsuarioFree extends Usuario {

    public UsuarioFree(String nome, String email) {

        super(nome, email);
    }

    @Override
    public void exibir() {

        System.out.println(
                nome + " (Usuário Free)"
        );
    }
}