/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locadora;

import java.util.Date;

public class Revista extends Produto{
  private String editora;

    public Revista(String codigo, String nome, int quantidade, String editora) {
        super(codigo, nome, quantidade);
        this.editora = editora;
        this.setPreco(15.00);
    }


  //methods
  @Override
  public String toString() {
    return "Revista: " + this.getNome() 
    + "\nCodigo: " + this.getCodigo() 
    + "\nPreço" + this.getPreco() 
    + "\nQuantidade: " + this.getQuantidade()
    + "\nEditora: " + this.getEditora();
  }

  //getters and setters
  public void setEditora(String editora){
    this.editora = editora;
  }

  public String getEditora(){
    return this.editora;
  }


}