/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Questão8L04;

/**
 *
 * @author Fernando
 */
public interface FormaGeometrica {
    double calcularArea();
    default void imprimir(){
        System.out.println("Nome da formula...");
    }
}
