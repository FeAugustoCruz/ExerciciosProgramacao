/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão5L03;

/**
 *
 * @author Fernando
 */
public class Carro extends Veiculo{
    
    public Carro(int ano, String marca){
        super(ano, marca);
    }
    
    @Override
    public void acelerar(){
        System.out.println("O veiculo acelerou 40 km/s...");
    };
}
