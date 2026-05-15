package br.com.streaming.modelo;

public class Usuario {

    protected String nome;
    protected String email;

    public Usuario(String nome, String email) {

        this.nome = nome;
        this.email = email;
    }

    public void exibir() {

        System.out.println(nome + " - " + email);
    }
}