package com.henriqueaguiiar.entities;

public class Audio {
    private String titulo;
    private int totalReproducoes;
    private int totalCurtidas;
    private double classicacao;


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getTotalReproducoes() {
        return totalReproducoes;
    }

    public int getTotalCurtidas() {
        return totalCurtidas;
    }

    public double getClassicacao() {
        return classicacao;
    }

    public void curte(){
        this.totalCurtidas++;
    }
    public void reproduzir(){
        this.totalReproducoes++;
    }

}

