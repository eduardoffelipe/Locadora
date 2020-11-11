package com.mycompany.locadora;

import java.util.ArrayList;

public class Venda {
    private Cliente cliente;
    private double preco;
    private double precoTotal;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Venda() {
    }

// methods
    @Override
    public String toString() {
        String retorno = "\nCliente: " + this.cliente.getNome();
        retorno += "\nValor Total a Pagar: " + this.precoTotal;
        for(Produto produto : produtos){
            retorno += "\nProduto: " + produto.getNome();
        }
        return retorno;     
    }
// getters and setters
    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }
    
}
