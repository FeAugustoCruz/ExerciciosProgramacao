/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão5L03;

/**
 *
 * @author Fernando
 */
public abstract class Veiculo {
    private int ano;
    private String marca;
    
    public Veiculo(int ano, String marca){
        this.ano = ano;
        this.marca = marca;
    }
    
    public void acelerar(){};
}
