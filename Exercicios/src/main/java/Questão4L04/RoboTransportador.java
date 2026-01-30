/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão4L04;

/**
 *
 * @author Fernando
 */
public class RoboTransportador implements Movimentavel{
    
    @Override
    public void moverPara(double x, double y){
        System.out.printf("Movendo o robo trasportador para (%.2f, %.2f)\n", x, y);
    }
}
