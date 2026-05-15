package br.com.streaming.modelo;

public abstract class ItemReproducao {

    protected String titulo;

    public ItemReproducao(String titulo) {
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
}