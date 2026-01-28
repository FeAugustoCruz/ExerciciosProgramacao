/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão2L03;

/**
 *
 * @author Fernando
 */
public class Pessoa{
    private int idade;
    private String nome;
    
    public Pessoa(int idade, String nome){
        this.idade = idade;
        this.nome = nome;
    }
    
    public void exibirDados(){
        System.out.println("Idade: " + idade);
        System.out.println("Nome: " + nome);
    }
}
