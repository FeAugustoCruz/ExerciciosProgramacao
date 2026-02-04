/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão10L05;

/**
 *
 * @author Fernando
 */
import java.util.Collections;
import java.util.ArrayList;
        
public class Main {
    public static void main(String[] args){
        ArrayList<Pessoa> colecao = new ArrayList<>();
        colecao.add(new Pessoa("Fernando", 12));
        colecao.add(new Pessoa("Julio", 32));
        colecao.add(new Pessoa("Ana", 43));
        
        Collections.sort(colecao);
        
        for(Pessoa p: colecao){
            System.out.println(p.toString());
        }
        
    }
}
