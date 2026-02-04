/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão10L05;

/**
 *
 * @author Fernando
 */

public class Pessoa implements Comparable<Pessoa>{
    public String nome;
    public int idade;
    
    
    public Pessoa(String nome, int idade){
        this.idade = idade;
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    @Override
    public int compareTo(Pessoa pessoa){
        return this.nome.compareToIgnoreCase(pessoa.getNome());
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome + " Idade: " + this.idade;
    }
}
