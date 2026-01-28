/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão5L03;

/**
 *
 * @author Fernando
 */
public class Moto extends Veiculo{
    
    public Moto(int ano, String marca){
        super(ano, marca);
    }
    
    @Override
    public void acelerar(){
        System.out.println("O veiculo acelerou 20 km/h...");
    }
}
