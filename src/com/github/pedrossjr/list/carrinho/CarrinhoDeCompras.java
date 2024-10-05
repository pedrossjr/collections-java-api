package com.github.pedrossjr.list.carrinho;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }

    public void removerItem(String nome) {
        List<Item> itemsParaRemover = new ArrayList<>();

        for( Item i : itemList) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemsParaRemover.add(i);
            }
        }

        itemList.removeAll(itemsParaRemover);
    }

    public double calcularValorTotal() {
         double valorTotal = 0d;

        if(!itemList.isEmpty()){
            for( Item i : itemList ) {
                double totalItem = i.getPreco() * i.getQuantidade();
                valorTotal += totalItem;
            }
            return valorTotal;
        } else {
            throw new RuntimeException("O carrinho está vazio.");
        }
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoCompra = new CarrinhoDeCompras();

        carrinhoCompra.adicionarItem("Blusa", 49.90, 2);
        carrinhoCompra.adicionarItem("Short", 29.90, 1);
        carrinhoCompra.adicionarItem("Camiseta", 19.90, 4);
        carrinhoCompra.adicionarItem("Meia", 9.90, 13);

        carrinhoCompra.exibirItens();

        carrinhoCompra.removerItem("Blusa");

        carrinhoCompra.exibirItens();

        System.out.println("O valor total da compra é R$ " + carrinhoCompra.calcularValorTotal());
    }
}
