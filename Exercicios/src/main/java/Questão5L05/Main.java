/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão5L05;

/**
 *
 * @author Fernando
 */

import java.util.HashSet;
public class Main {
    public static void main(String[] args){
        HashSet<Produto> colecao = new HashSet<>();
        
        
        colecao.add(new Produto("Amaciante", 43.12));
        colecao.add(new Produto("Carne", 24.99));
        colecao.add(new Produto("Arroz", 17.99));
        colecao.add(new Produto("Feijão", 45.99));
        colecao.add(new Produto("Farinha de Trigo", 12.99));
        
        for(Produto cols: colecao){
            System.out.println("Nome: " + cols.getNome());
            System.out.println("Preco: " + cols.getPreco());
        }
        
    }
}
