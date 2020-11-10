/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locadora;

import java.util.Date;


public class Livro extends Produto {
  private boolean isColection;
    
    //constructor
    public Livro(String codigo, String nome, int quantidade, boolean isColection) {
        super(codigo, nome, quantidade);
        this.setPreco(50.00);
        this.isColection = isColection;
    }
    
    //methods
    @Override
    public String toString() {
    return "Livro: " + this.getNome() 
    + "\nCodigo:" + this.getCodigo() 
    + "\nPreço: " + this.getPreco() 
    + "\nQuantidade: " 
    + this.getQuantidade();
  }
    

    
}
