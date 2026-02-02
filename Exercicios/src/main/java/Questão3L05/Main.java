/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão3L05;

/**
 *
 * @author Fernando
 */

import java.util.ArrayList;
public class Main {
    public static void main(String[] args){
        ArrayList<AparelhoSonoro> aparelhos = new ArrayList<>();
        
        aparelhos.add(new Radio());
        aparelhos.add(new Radio());
        aparelhos.add(new TocaFitas());
        aparelhos.add(new TocaFitas());
        
        //O for each deve ser com o tipo que está dentro!
        for(AparelhoSonoro aps: aparelhos){
            aps.som();
        }
        
        //metodo get(int posição) -> retorna o objeto daquela posição
        for(int i = aparelhos.size() - 1; i >= 0; i --){
            if(aparelhos.get(i) instanceof TocaFitas){
                aparelhos.remove(i);
            }
        }
        
        for(AparelhoSonoro aps: aparelhos){
            aps.som();
        }
    }
}
