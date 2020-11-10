/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locadora;

import java.util.Date;

public class Dvd extends Produto{
    
    private String artista;
    
    //constructor
    public Dvd(String codigo, String nome, int quantidade, String artista) {
        super(codigo, nome, quantidade);
        this.artista = artista;
        this.setPreco(20.00);
    }
    
    //methods    
    public String Imprime() {
    return "Dvd: " + this.getNome() 
    + "\nCodigo: " + this.getCodigo() 
    + "\nPreço" + this.getPreco() 
    + "\nQuantidade: " + this.getQuantidade()
    + "\nArtista: " + this.getArtista();
  };

    //getters and setters
    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }
    
    
}
