/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão6L05;

/**
 *
 * @author Fernando
 */
import java.util.Iterator;

public class Produto implements Comparable<Produto>{
    private String nome;
    private double preco;
    
    public Produto(String nome, double preco){
        this.nome = nome;
        this.preco = preco;
    }
    
    public String getNome(){
        return nome;
    }
    
    public double getPreco(){
        return preco;
    }
    
    @Override
    public int compareTo(Produto produto){
        return this.nome.compareToIgnoreCase(produto.getNome());
    }
    
    @Override
    public String toString(){
        return "nome='" + nome + "', preco=" + preco;
    }
}
