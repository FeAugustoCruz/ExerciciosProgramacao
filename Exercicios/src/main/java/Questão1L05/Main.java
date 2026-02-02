/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão1L05;

/**
 *
 * @author Fernando
 */
public class Main {
    public static void main(String[] args){
        
        //                            type casting de "Teste" para uma String
        Caixa<String> caixa1 = new Caixa();
        Caixa<Integer> caixa2 = new Caixa();
        
        caixa1.guardar("Teste");
        caixa2.guardar(10);
        
        System.out.printf("O valor armazenado pela caixa1 %s\n", caixa1.pegar());
        System.out.printf("O valor amarzenado pela caixa2 %d\n", caixa2.pegar());
    }
}
