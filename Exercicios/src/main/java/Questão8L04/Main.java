/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão8L04;

/**
 *
 * @author Fernando
 */
public class Main {
    public static void main(String[] args){
        Quadrado qua = new Quadrado(42.12);
        Retangulo ret = new Retangulo(12.12);
        Triangulo tri = new Triangulo(45, 10.12);
        Circulo cir = new Circulo(1.23);
        
        //Sobrescrito
        qua.imprimir();
        //utilizando a definição padrão
        ret.imprimir();
        //utilizando a definição padão
        tri.imprimir();
        //Sobrescrito
        cir.imprimir();
    }
}
