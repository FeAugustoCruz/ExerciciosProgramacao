/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão8L05;

/**
 *
 * @author Fernando
 */
import java.util.Iterator;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<String> colecao = new ArrayList<>();
        
        colecao.add("Amor");
        colecao.add("Bola");
        colecao.add("Trigo");
        
        Iterator<String> i = colecao.iterator();
        
        while(i.hasNext()){
            String palavra = i.next();
            if(palavra.startsWith("A")){
                i.remove();
            }
        }
        
        for(String palavras: colecao){
            System.out.println(palavras);
        }
    }
}
