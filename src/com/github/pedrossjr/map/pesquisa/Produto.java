package com.github.pedrossjr.map.pesquisa;

public class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidad) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidad;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome = '" + nome + '\'' +
                ", preco = " + preco +
                ", quantidad = " + quantidade +
                '}';
    }
}
