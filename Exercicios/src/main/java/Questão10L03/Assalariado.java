/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão10L03;

/**
 *
 * @author Fernando
 */
public class Assalariado extends Funcionario{
    
    public Assalariado(double salarioBase, String nome){
        super(nome, salarioBase);
    }

    
    @Override
    public double calcularPagamento(){ 
        return getSalarioBase();
    }
}
