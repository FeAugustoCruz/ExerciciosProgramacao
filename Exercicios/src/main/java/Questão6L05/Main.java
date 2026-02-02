/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão6L05;

/**
 *
 * @author Fernando
 */

import java.util.TreeSet;
public class Main {
    public static void main(String[] args){
        TreeSet<Produto> colecao = new TreeSet<>();
        
        colecao.add(new Produto("Amaciante", 13.99));
        colecao.add(new Produto("Batata", 4.99));
        colecao.add(new Produto("Sabonete", 3.99));
        colecao.add(new Produto("Detergente", 6.45));
        colecao.add(new Produto("Ovo", 15.99));
        colecao.add(new Produto("Papel higienico", 12.00));
        
        
        for(Produto pro: colecao){
            System.out.println(pro.toString());
        }
    }
}
