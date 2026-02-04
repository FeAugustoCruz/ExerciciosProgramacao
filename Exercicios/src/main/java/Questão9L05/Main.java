/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão9L05;

/**
 *
 * @author Fernando
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    
    public static void main(String[] args){
    
        ArrayList<Pessoa> colecao = new ArrayList<>();
    
        colecao.add(new Pessoa("Ana", 20));
        colecao.add(new Pessoa("Fernando", 21));
        colecao.add(new Pessoa("Julio", 31));
        colecao.add(new Pessoa("Carlos", 12));
        
        Collections.sort(colecao);
        
        for(Pessoa p: colecao){
            System.out.println(p.toString());
        }
    }
    
}
