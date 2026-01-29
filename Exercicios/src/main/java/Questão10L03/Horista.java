/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão10L03;

/**
 *
 * @author Fernando
 */
public class Horista extends Funcionario{
    private int horas;
    private double valorHoras;
    
    public Horista(double salarioBase, String nome, int horas, double valorHoras){
        super(nome, salarioBase);
        this.horas = horas;
        this.valorHoras = valorHoras;     
    }
    
    @Override
    public double calcularPagamento(){
        return getSalarioBase() + horas*valorHoras;
    }
}
