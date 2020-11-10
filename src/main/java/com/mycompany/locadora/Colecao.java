/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locadora;

import java.util.ArrayList;

public class Colecao {
    private String codigo;
    private String nome;
    private double preco;
    private ArrayList<Livro> colecao1 = new ArrayList<>();

    public Colecao(String codigo, String nome) {
        this.nome = nome;
        this.codigo = codigo;
        this.preco = 200.00;
    }


    
  
    
    //methods
    public void addLivroColection(Livro livro){
        colecao1.add(livro);
    }

    @Override
    public String toString() {
        return "Colecao: " + this.nome 
                + "\nCódigo: " + codigo 
                + "\nPreco: " + preco 
                + "\nLivros na Coleção: \n" + colecao1;
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
