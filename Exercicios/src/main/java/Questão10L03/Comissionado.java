/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão10L03;

/**
 *
 * @author Fernando
 */
public class Comissionado extends Funcionario{
    public double comissao;
    
    
    public Comissionado(double salarioBase, String nome, double comissao){
        super(nome, salarioBase);
        this.comissao = comissao;
    }
           
    @Override
    public double calcularPagamento(){
        return getSalarioBase() + comissao;
    }
}
