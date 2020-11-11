package com.mycompany.locadora;

import java.util.ArrayList;

public class Colecao {
    private String codigo;
    private String nome;
    private double preco;
    private ArrayList<Livro> colecao = new ArrayList<>();

    public Colecao(String codigo, String nome) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = 200.00;
    }

  
    //methods
    public void addLivroColection(Livro livro){
        colecao.add(livro);
    }
    public boolean confereEstoque(){
        for(Livro item: colecao){
            if(item.getQuantidade() <= 0){
                System.out.println("Sem estoque de livro na coleção");
                return false;
            }else{
                 return true;
            }
        }
        return false;
    }
    
    @Override
    public String toString() {
        return "Colecao: " + this.nome 
        + "\nCódigo: " + codigo 
        + "\nPreco: R$" + preco 
        + "\nLivros na Coleção: \n" + colecao;
    }
    

    //getters and setters
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
}
