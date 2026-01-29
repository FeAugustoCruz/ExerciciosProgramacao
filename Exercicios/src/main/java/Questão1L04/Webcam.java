/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão1L04;

/**
 *
 * @author Fernando
 */
public class Webcam implements Conectavel{
    @Override
    public void conectar(){
        System.out.println("A wabcan se conectou no sistema!");
    }
    
    @Override
    public void desconectar(){
        System.out.println("A wabcan se desconectou do sistema!");
    }
}
