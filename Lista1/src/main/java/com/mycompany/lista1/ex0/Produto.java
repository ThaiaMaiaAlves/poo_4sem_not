/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.lista1.ex0;

/**
 *
 * @author 1090481923008
 */
//calasse é algo abastrato e serve de modelo para seus objetos
public class Produto {
    public String nome;  //tipo de dado é String (uma classe)
    public int qtde;     //tipo de dado é int (tipo primitivo)
    public double preco; //tipo de dado primitivo (tipo primitivo)
    
    //cria um metodo construtor
    public Produto(){
    
}
    
    
    //cria um método construtor
    public Produto (String nome, int qtde, double preco){
        this.nome = nome;
        this.qtde = qtde;
        this.preco = preco;        
    }
    
    //método que compra um produto, aumentando sua qtde
    //método não retorna nada
    public void comprar (int x){
        this.qtde = this.qtde + x;       
    
    }
    
    public void vender (int x){
        if(this.qtde >= x){
            this.qtde = this.qtde - x;
        }
    else System.out.println ("Sem estoque");
        }
    
    //this representa o objeto que chama o método
    public void mostrar (){
        System.out.println (" Nome: " + this.nome + "Qtde: " + this.qtde + " Preço " + this.preco);
    }
    
    public void subir (double x){
        this.preco += x;     
    }
    public void descer (double x){
       // if (x <= this.preco)
    }
}
