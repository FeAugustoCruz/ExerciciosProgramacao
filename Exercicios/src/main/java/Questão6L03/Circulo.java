/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão6L03;

/**
 *
 * @author Fernando
 */

import java.lang.Math;

public class Circulo extends Figura{
    public double raio;
    
    public Circulo(double raio){
        this.raio = raio;
    }
    
    @Override
    public double calcularArea(){
        return Math.PI*Math.pow(raio, 2);
    }
    
    public void getRaio(double raio){
        this.raio = raio;
    }
}
