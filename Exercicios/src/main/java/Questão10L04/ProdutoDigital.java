/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão10L04;

/**
 *
 * @author Fernando
 */
public class ProdutoDigital implements ItemVenda{
    private double preco;
    
    public ProdutoDigital(double preco){
        this.preco = preco;
    }
    
    @Override
    public double getPreco(){
        return preco;
    }
    
}
