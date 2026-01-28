/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão3L03;

/**
 *
 * @author Fernando
 */
public class Gerente extends Funcionario{
    private double salario;
    
    @Override
    public void calcularSalario(int vendas){
        salario = 1614 + 0.2*vendas;
    }
    
    public void mostraSalario(){
        System.out.println("Salario: " + salario);
    }
    
    public static void main(String[] args) {
        Gerente gerente = new Gerente();
        
        gerente.calcularSalario(1342);
        gerente.mostraSalario();
    }
}
