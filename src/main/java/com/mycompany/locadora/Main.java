/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.locadora;

import com.mycompany.locadora.Cliente;

public class Main {
    
    
    public static void main(String[] args) {
       Cliente c1 = new Cliente("Fafix", "(28)99999999", "centro", true, true);
        System.out.println(c1);
        c1.toString();
        Dvd d1 = new Dvd("0001" , "Lightzera", 5, "Fafix");
        System.out.println(d1.Imprime());
        Livro l1 = new Livro("0001", "Enciclopedia Geografia", 1, true);
        Colecao col1 = new Colecao("c001", "Enciclopedia");
        col1.addLivroColection(l1);
        
        System.out.println(col1);
    }
    
} 
