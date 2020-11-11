package com.mycompany.locadora;

public class Livro extends Produto {
  private boolean isColection;
    
    //constructor
    public Livro(String codigo, String nome, int quantidade,boolean isColection, boolean alugado) {
        super(codigo, nome, quantidade, alugado);
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
