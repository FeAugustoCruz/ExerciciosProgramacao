/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão5L03;

/**
 *
 * @author Fernando
 */
public class Main {
    public static void main(String[] args) {
        Carro v1 = new Carro(2020, "Toyota");
        Moto v2 = new Moto(2022, "Honda");

        v1.acelerar(); // comportamento de Carro
        v2.acelerar(); // comportamento de Moto
    }
}
