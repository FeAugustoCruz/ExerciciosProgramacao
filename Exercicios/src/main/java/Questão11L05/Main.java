/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão11L05;

/**
 *
 * @author Fernando
 */
import java.util.ArrayList;
import java.util.Collections;
public class Main {
    public static void main(String[] args){
        ArrayList<Par> colecao = new ArrayList<>();
        
        colecao.add(new Par("Chave1", 3));
        colecao.add(new Par("Chave2", 5));
        colecao.add(new Par("Chava3", 10));
        colecao.add(new Par("Chave4", 2));
        
        Collections.sort(colecao);
        
        for(Par c: colecao){
            System.out.println(c.toString());
        }
        
    }
}
