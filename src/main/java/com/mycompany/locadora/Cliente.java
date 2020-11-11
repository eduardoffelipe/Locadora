package com.mycompany.locadora;

public class Cliente {
  private String nome;
  private String telefone;
  private String endereco; 
  private boolean isVip;
  private boolean entrega;

    //constructor
    public Cliente(String nome, String telefone, String endereco, boolean isVip, boolean entrega) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.isVip = isVip;
        this.entrega = entrega;
    }
 
    //methods

    @Override
    public String toString() {
        return "Cliente: " + "{"
        + "Nome =" + nome 
        + ", Telefone: " + telefone 
        + ", Endereco: " + endereco 
        + ", isVip: " + isVip 
        + ", Entrega: " + entrega 
        + '}';
    }
    

    //getters and setters
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isIsVip() {
        return isVip;
    }

    public void setIsVip(boolean isVip) {
        this.isVip = isVip;
    }

    public boolean isEntrega() {
        return entrega;
    }

    public void setEntrega(boolean entrega) {
        this.entrega = entrega;
    }

    
  
}
