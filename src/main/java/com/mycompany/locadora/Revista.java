package com.mycompany.locadora;

public class Revista extends Produto{
  private String editora;

    public Revista(String codigo, String nome, int quantidade, String editora,boolean alugado) {
        super(codigo, nome, quantidade,alugado);
        this.editora = editora;
        this.setPreco(15.00);
    }


  //methods
  @Override
  public String toString() {
    return "Revista: " + this.getNome() 
    + "\nCodigo: " + this.getCodigo() 
    + "\nPreço: R$" + this.getPreco() 
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