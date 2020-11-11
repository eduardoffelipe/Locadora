package com.mycompany.locadora;

import java.util.ArrayList;

public class Estoque {
    private int quantidadeLivro;
    private int quantidadeRevista;
    private int quantidadeDVD;

    public Estoque(int codigo, String nome) {
        this.quantidadeLivro = quantidadeLivro;
        this.quantidadeRevista = quantidadeRevista;
        this.quantidadeDVD = quantidadeDVD;
    }
    
    
   // methods
  
    @Override
    public String toString() {
        String retorno = "Quantidade De DVD: " + this.quantidadeDVD;
        retorno += "\nQuantidade De Livro: " + this.quantidadeLivro;
        retorno += "\nQuantidade De Revista: " + this.quantidadeRevista;
        return retorno;     
    }
    
   // getters and setters

    public int getQuantidadeLivro() {
        return quantidadeLivro;
    }

    public void setQuantidadeLivro(int quantidadeLivro) {
        this.quantidadeLivro = quantidadeLivro;
    }

    public int getQuantidadeRevista() {
        return quantidadeRevista;
    }

    public void setQuantidadeRevista(int quantidadeRevista) {
        this.quantidadeRevista = quantidadeRevista;
    }

    public int getQuantidadeDVD() {
        return quantidadeDVD;
    }

    public void setQuantidadeDVD(int quantidadeDVD) {
        this.quantidadeDVD = quantidadeDVD;
    }














}



