package com.mycompany.locadora;

import java.util.ArrayList;
import java.time.LocalDate;

public class Alugados {

    private Cliente cliente;
    private double preco;
    private LocalDate dataLocacao;
    private LocalDate dataDevolucao;
    private final double multa;
    private double precoTotal;
    private ArrayList<Produto> produtos = new ArrayList<>();

    public Alugados() {
        this.multa = 5.0;
    }

    // methods
    public void alugarProduto(Produto produto, Cliente cliente) {
        try {
            if (produto.getQuantidade() >= 1) {
                this.dataLocacao = LocalDate.now();
                this.dataDevolucao = this.dataLocacao.plusDays(5);
                this.setCliente(cliente);
                this.setPreco(10.00);
                produto.setQuantidade(produto.getQuantidade() - 1);
                produtos.add(produto);
            } else {
                System.out.println("Sem Produto no Estoque");
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public void devolucaoProduto(Produto produto) {
        for (Produto produtos : produtos) {
            if (produtos.equals(produto)) {
                if (this.cliente.isIsVip()) {
                    this.precoTotal += this.getPreco() * 0.95;
                } else {
                    this.precoTotal += this.getPreco();
                }
                if (LocalDate.now().isAfter(dataDevolucao)) {
                    this.precoTotal += this.getPreco() + this.multa;
                } else {
                    if (this.cliente.isEntrega() && this.cliente.getEndereco().equals("centro")) {
                        this.precoTotal += 10.0;
                    } else if (this.cliente.getEndereco().equals("outros")) {
                        this.precoTotal += 15.0;
                    }
                }
                this.produtos.remove(produto);
                break;
            }
        }
    }

    @Override
    public String toString() {
        String retorno = "Data da Locação: " + this.dataLocacao;
        retorno += "\nCliente: " + this.cliente.getNome();
        retorno += "\nValor Total a Pagar: R$" + this.precoTotal;
        for (Produto produto : produtos) {
            retorno += "\nProduto: " + produto.getNome();
        }
        return retorno;
    }
    // getters and setters

    public LocalDate getDataLocacao() {
        return dataLocacao;
    }

    public void setDataLocacao(LocalDate dataLocacao) {
        this.dataLocacao = dataLocacao;
    }

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

    public LocalDate getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDate dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

}
