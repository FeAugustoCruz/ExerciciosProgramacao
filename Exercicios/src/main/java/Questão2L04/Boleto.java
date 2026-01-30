/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão2L04;

/**
 *
 * @author Fernando
 */
public class Boleto implements MetododePagamento{
    @Override
    public void processarPagamento(MetododePagamento metodo, double valor){
        if(metodo.autorizar(valor)){
            System.out.printf("O valor de %.2fR$ foi autorizado!\n", valor);
        }else{
            System.out.printf("O valor de %.2fR$ foi negado!\n", valor);
        }
    }
    
    @Override 
    public boolean autorizar(double valor){
        return valor >= 0;
    }
}
