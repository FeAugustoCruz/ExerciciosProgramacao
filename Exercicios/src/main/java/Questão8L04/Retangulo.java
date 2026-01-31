/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão8L04;

/**
 *
 * @author Fernando
 */
public class Retangulo implements FormaGeometrica{
      private double lado;
    
    
    public Retangulo(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        return lado*lado;
    }
    
}
