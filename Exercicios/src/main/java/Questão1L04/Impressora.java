/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão1L04;

/**
 *
 * @author Fernando
 */
public class Impressora implements Conectavel{

    @Override
    public void conectar() {
        System.out.println("A impressora se conectou no sistema!");
    }

    @Override
    public void desconectar() {
        System.out.println("A impressora se desconectou do sistema!");
    }
    
}
