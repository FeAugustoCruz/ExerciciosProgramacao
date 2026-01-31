/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão8L04;

/**
 *
 * @author Fernando
 */
public class Quadrado implements FormaGeometrica{
    private double lado;
    
    
    public Quadrado(double lado){
        this.lado = lado;
    }
    
    @Override
    public double calcularArea(){
        return lado*lado;
    }
    
    @Override
    public void imprimir(){
        System.out.println("Quadrado");
    }
}
