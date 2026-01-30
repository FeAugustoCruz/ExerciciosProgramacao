/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão4L04;

/**
 *
 * @author Fernando
 */
public class RoboSoldador implements Movimentavel, Operavel{
    
    @Override
    public void moverPara(double x, double y){
        System.out.printf("Movendo o robo soldador para (%.2f, %.2f)\n", x, y);
    }
    
    @Override
    public void execultarOperacao(String nome){
        System.out.printf("O robo soldador esta execultando %s\n", nome);
    }
}
