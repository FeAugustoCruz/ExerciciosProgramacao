/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão4L04;

/**
 *
 * @author Fernando
 */
public class Main {
    
   public static void operador(Movimentavel[] movimentaveis, Operavel[] operaveis){
       for(Movimentavel movs: movimentaveis){
           movs.moverPara(45.12, 65.13);
       }
       
       for(Operavel opr: operaveis){
           opr.execultarOperacao("Pegar");
       }
   } 
    
   public static void main(String[] args){
       
        RoboSoldador robosoldador1 = new RoboSoldador();
        RoboSoldador robosoldador2 = new RoboSoldador();
        RoboTransportador robotransportador1 = new RoboTransportador();
        RoboTransportador robotransportador2 = new RoboTransportador();
        RoboMontagem robomontagem1 = new RoboMontagem(); 
        
        //acontece um type casting dos objetos!
        Movimentavel[] movimentaveis = {robosoldador1, robosoldador2, robotransportador1, robotransportador2};
        Operavel[] operaveis = {robomontagem1, robosoldador1, robosoldador2};
        
        Main.operador(movimentaveis, operaveis);
   } 
}
