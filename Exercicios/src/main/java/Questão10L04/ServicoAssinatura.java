/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão10L04;

/**
 *
 * @author Fernando
 */
public class ServicoAssinatura implements ItemVenda{
    private int meses;
    private double preco;
    
    public ServicoAssinatura(double preco, int meses){
        this.preco = preco;
        this.meses = meses;
    }
    
    @Override
    public double getPreco(){
        return assinatura(meses);
    }
    
    public double assinatura(int meses){
        return preco + meses*33.99;
    }
}
