/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão9L05;

/**
 *
 * @author Fernando
 */
public class Pessoa implements Comparable<Pessoa>{
    private String nome;
    private int idade;
    
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
    @Override
    public int compareTo(Pessoa pessoa){
        return Integer.compare(this.idade, pessoa.getIdade());
    }
    
    @Override
    public String toString(){
        return "Nome: " + this.nome +  " Idade: " + this.idade;
    }
}
