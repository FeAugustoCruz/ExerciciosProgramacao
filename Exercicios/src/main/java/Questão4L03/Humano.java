/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão4L03;

/**
 *
 * @author Fernando
 */
public class Humano extends Animal{
  
    @Override
    public void emitirSom(){
        System.out.println("Olaaaaa!");
    }    
    
    public static void main(String[] args) {
        Humano humano = new Humano();
        humano.emitirSom();
    }
}
