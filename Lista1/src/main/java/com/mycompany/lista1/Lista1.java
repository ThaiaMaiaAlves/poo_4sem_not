/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.lista1;

import com.mycompany.lista1.ex0.Produto;

/**
 *
 * @author 1090481923008
 */
public class Lista1 {

    public static void main(String [] args) {
        
        //criar objetos da classe Produto
        //criar instâncias da classe Produto
        Produto obj1 = new Produto();
        obj1.nome = "Máscara";
        obj1.qtde = 100;
        obj1.preco = 5;
        
        obj1.comprar(10);
        obj1.vender (5);
        
        obj1.mostrar ();
        //System.out.println("Nome: " + obj1.nome + "Qtde: " + obj1.qtde + " Preço " + obj1.preco);
                                
        //vamos instanciar explorando o método construtor
        //método que tem o mesmo nome da classe
        //método que inicializa as variáveis da classe
        //chamao método construtor
        
        Produto obj2 = new Produto("bola de  basquete", 10, 93.90);
        obj2.comprar (3);
        obj2.vender (2);
        
         obj2.mostrar ();
        //System.out.println("Nome: " + obj2.nome + "Qtde: " + obj2.qtde + " Preço " + obj2.preco);
        
        Produto obj3 = new Produto ("Fortinite", 1, 39.90);
        obj3.comprar(1);
        obj3.vender(3);
        
        obj3.mostrar ();
        //System.out.println (" Nome: " + obj3.nome + "Qtde: " + obj3.qtde + " Preço " + obj3.preco);
         
        
                
    }
}
