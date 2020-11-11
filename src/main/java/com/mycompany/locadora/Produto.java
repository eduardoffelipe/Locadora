package com.mycompany.locadora;

public abstract class Produto {
    private String codigo;
    private String nome;
    private Double preco;
    private int quantidade;
    private boolean isAlugado;

    // constructor
    public Produto(String codigo, String nome, int quantidade, boolean isAlugado) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
        this.isAlugado = isAlugado;
    }

    // methods


    // getters and setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public boolean isAlugado() {
        return isAlugado;
    }

    public void setisAlugado(boolean isAlugado) {
        this.isAlugado = isAlugado;
    }
}
