/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locadora;


public class Cliente {
  private String nome;
  private String telefone;
  private String endereco; 
  private boolean isVip;
  private int entrega;

    //constructor
    public Cliente(String nome, String telefone, String endereco, boolean isVip, boolean isEntrega) {
        this.nome = nome;
        this.telefone = telefone;
        this.endereco = endereco;
        this.isVip = isVip;
        this.entrega = entrega;
    }
 
    //methods

    @Override
    public String toString() {
        return "Cliente{" + "nome=" + nome + ", telefone=" + telefone + ", endereco=" + endereco + ", isVip=" + isVip + ", entrega=" + entrega + '}';
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

    public int getIsEntrega() {
        return entrega;
    }

    public void setIsEntrega(boolean isEntrega) {
        this.entrega = entrega;
    }

    
  
}
