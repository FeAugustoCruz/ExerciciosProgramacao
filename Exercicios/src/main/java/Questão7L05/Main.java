/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão7L05;

/**
 *
 * @author Fernando
 */

import java.util.TreeSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args){
        TreeSet<Integer> colecao = new TreeSet<>();
        
        colecao.add(0);
        colecao.add(23);
        colecao.add(143);
        colecao.add(7);
        
        Iterator<Integer> i = colecao.iterator();
        
        while(i.hasNext()){
            int valor = i.next();
            System.out.println("Numero: " + valor);
        }
    
    }
}
