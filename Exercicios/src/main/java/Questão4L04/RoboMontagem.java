/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão4L04;

/**
 *
 * @author Fernando
 */
public class RoboMontagem implements Operavel{
    
    @Override
    public void execultarOperacao(String nome){
        System.out.printf("O robo montavel esta execultando %s\n", nome);
    }
}
