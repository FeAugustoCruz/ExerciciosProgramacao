/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão6L03;

/**
 *
 * @author Fernando
 */
public class Main {
    public static void main(String[] args) {
        Figura circulo = new Circulo(5.0);
        Figura quadrado = new Quadrado(5.0);
        
        System.out.printf("A area do circulo e: %.2f", circulo.calcularArea());
        System.out.printf("A area do quadrado e: %.2f", quadrado.calcularArea());
    }
}
