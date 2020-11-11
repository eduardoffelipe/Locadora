package com.mycompany.locadora;

public class Main {
    
    
    public static void main(String[] args) {
       Cliente c1 = new Cliente("Fafix", "(28)99999999", "centro", true, true);
        //System.out.println(c1);
        //System.out.println();

        Dvd d1 = new Dvd("0001" , "Lightzera", 5, "Fafix",false);
        //System.out.println(d1.Imprime());
        //System.out.println();

        Livro l1 = new Livro("0001", "Enciclopedia Geografia", 1, true,false);

        Colecao col1 = new Colecao("c001", "Enciclopedia");
        col1.addLivroColection(l1);
        //System.out.println(col1);
        //System.out.println();

        Livro l2 = new Livro("0002", "Hp", 1, true,true);
        //System.out.println(l2);
        //System.out.println();
        
        Alugados x = new Alugados();
        x.addProdutoAlugado(l2, c1);
        //x.addProdutoAlugado(l1, c1);
        System.out.println(x);
        System.out.println();
        x.devolucaoProduto(l1);
        x.devolucaoProduto(l2);
        System.out.println(x);
    }
    
} 
