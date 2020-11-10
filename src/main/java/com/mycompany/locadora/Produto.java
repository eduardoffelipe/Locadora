/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locadora;

import java.util.Date;

public abstract class Produto {
  private String codigo;
  private String nome;                         
  private Double preco;                         
  private Date dataUltimaLocacao;
  private int quantidade;
    
  //constructor
    public Produto(String codigo, String nome, int quantidade) {
        this.codigo = codigo;
        this.nome = nome;
        this.quantidade = quantidade;
    }
    
    //methods
    
    
    
    //getters and setters
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

    public Date getDataUltimaLocacao() {
        return dataUltimaLocacao;
    }

    public void setDataUltimaLocacao(Date dataUltimaLocacao) {
        this.dataUltimaLocacao = dataUltimaLocacao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }
  
  
}
