/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão4L03;

/**
 *
 * @author Fernando
 */
public class Gato extends Animal{
    @Override
    public void emitirSom(){
        System.out.println("MIAAAAAAuu!");
    }
    
    public static void main(String[] args) {
        Gato gato = new Gato();
        
        gato.emitirSom();
    }
}
