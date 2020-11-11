package com.mycompany.locadora;

import java.util.ArrayList;

public class Venda {

    private Cliente cliente;
    private double precoTotal;
    private ArrayList<Produto> pedido = new ArrayList<>();
    private double valorP;

    public Venda() {
        
    }
    // methods

    public void venderProduto(Produto produto, Cliente cliente) {
        try {
            if (produto.getQuantidade() >= 1) {
                if (produto instanceof Livro && ((Livro) produto).isIsColection()) {
                    System.out.println("Livro de uma Coleção não pode ser vendido separadamente.");
                    System.exit(0);
                }
                this.setCliente(cliente);
                produto.setQuantidade(produto.getQuantidade() - 1);
                pedido.add(produto);
            } else {
                System.out.println("Sem Produto no Estoque");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public double venderColecao(Colecao colecoes, Cliente cliente) {
            this.setCliente(cliente);
            if (colecoes.confereEstoque() == false) {
                System.out.println("Colecão Indisponivel");
            } else {
                if (this.cliente.isIsVip()) {
                    this.precoTotal += colecoes.getPreco() * 0.95;
                } else {
                    this.precoTotal += colecoes.getPreco();
                }
                if (this.cliente.isEntrega() && this.cliente.getEndereco().equals("centro")) {
                    this.precoTotal += 10.0;
                } else if (this.cliente.getEndereco().equals("outros")) {
                    this.precoTotal += 15.0;
                }
            }
            valorP = this.precoTotal;
        return valorP;
    }

    public double valorApagar() {
        for (Produto pedido : pedido) {
            if (this.cliente.isIsVip()) {
                this.precoTotal += pedido.getPreco() * 0.95;
            } else {
                this.precoTotal += pedido.getPreco();
            }
            if (this.cliente.isEntrega() && this.cliente.getEndereco().equals("centro")) {
                this.precoTotal += 10.0;
            } else if (this.cliente.getEndereco().equals("outros")) {
                this.precoTotal += 15.0;
            }
        }
        valorP = this.precoTotal;
        return valorP;
    }

    @Override
    public String toString() {
        String retorno = "\nCliente: " + this.cliente.getNome();
        retorno += "\nValor Total a Pagar: R$" + this.valorP;
        for (Produto produto : pedido) {
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

    public double getPrecoTotal() {
        return precoTotal;
    }

    public void setPrecoTotal(double precoTotal) {
        this.precoTotal = precoTotal;
    }

}
