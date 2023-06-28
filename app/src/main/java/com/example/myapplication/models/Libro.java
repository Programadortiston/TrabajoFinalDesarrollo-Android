package com.example.myapplication.models;





public class Libro {
    private String titulo;
    private String autor;
    private String genero;
    private int anho;
    private int stock;
    private String link;

    public Libro(String titulo, String autor, String genero, int anho, int stock, String link) {
        this.titulo = titulo;
        this.autor = autor;
        this.genero = genero;
        this.anho = anho;
        this.stock = stock;
        this.link = link;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnho() {
        return anho;
    }

    public void setAnho(int anho) {
        this.anho = anho;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
