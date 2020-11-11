package com.mycompany.locadora;

public class Dvd extends Produto{ 
    private String artista;
    
    //constructor
    public Dvd(String codigo, String nome, int quantidade, String artista,boolean alugado) {
        super(codigo, nome, quantidade,alugado);
        this.artista = artista;
        this.setPreco(20.00);
    }
    
    //methods    
    public String toString() {
    return "Dvd: " + this.getNome() 
    + "\nCodigo: " + this.getCodigo() 
    + "\nPreço:" + this.getPreco() 
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
