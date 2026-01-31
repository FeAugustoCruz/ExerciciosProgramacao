/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão7L04;

/**
 *
 * @author Fernando
 */
public class Umidade implements Sensor{
    
    @Override
    public void coletarDados(){
        System.out.println("O sensensor de umidade coletou dados!");
    }
    
    public double indiceUmindade(){
        return 12.34;
    }
}
