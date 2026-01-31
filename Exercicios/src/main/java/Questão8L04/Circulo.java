/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão8L04;

/**
 *
 * @author Fernando
 */
public class Circulo implements FormaGeometrica{
    private double raio;
    
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI*raio*raio;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Circulo");
    }
}
