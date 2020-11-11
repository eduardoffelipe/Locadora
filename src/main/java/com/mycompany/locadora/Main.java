package com.mycompany.locadora;

public class Main {
    
    
    public static void main(String[] args) {
       Cliente c1 = new Cliente("Carlos", "(28)99999999", "centro", false, true);
        //System.out.println(c1);
        //System.out.println();

        Dvd d1 = new Dvd("D001" , "Magal Espetacular", 5, "Sidney Magal",false);
        //System.out.println(d1);
        //System.out.println();
        Revista r1 = new Revista("R001" , "O Globo", 1, "Globo",false);
        //System.out.println(r1);
        //System.out.println();

        Livro l1 = new Livro("L001", "Enciclopedia Geografia", 1, true,false);

        Colecao col1 = new Colecao("c001", "Enciclopedia");
        col1.addLivroColection(l1);
        //System.out.println(col1);
        //System.out.println();

        Livro l2 = new Livro("0002", "Hp", 1, true,true);
        //System.out.println(l2);
        //System.out.println();
        
        Alugados x = new Alugados();
        //x.alugarProduto(l2, c1);
        //x.alugarProduto(l1, c1);
        //System.out.println(x);
        System.out.println();
        //x.devolucaoProduto(l1);
        //x.devolucaoProduto(l2);
        //System.out.println(x);
        Venda v = new Venda();
        v.venderProduto(l1,c1);
        System.out.println(v);
    }
    
} 
