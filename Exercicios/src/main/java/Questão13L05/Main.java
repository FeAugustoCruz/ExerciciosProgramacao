/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão13L05;

/**
 *
 * @author Fernando
 */
import java.util.HashSet;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        HashSet<String> colecao = new HashSet<>();
        
        colecao.add("Teste 1");
        colecao.add("Teste 2");
        colecao.add("Teste 3");
        colecao.add("Teste 4");
        
        ArrayList<String> colecao2 = new ArrayList<>(colecao);
        
        for(String s: colecao2){
            System.out.println(s);
        }
    }
}
