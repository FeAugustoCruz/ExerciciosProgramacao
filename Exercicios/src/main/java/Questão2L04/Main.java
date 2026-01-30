/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão2L04;

/**
 *
 * @author Fernando
 */
public class Main {
    
    public static void main(String[] args){
        MetododePagamento pix = new Pix();
        MetododePagamento boleto = new Boleto();
        MetododePagamento cartao = new CartaoCredito();
        
        pix.processarPagamento(pix, 5000);
        boleto.processarPagamento(cartao, 5000);
        cartao.processarPagamento(cartao, 5000);
        
    }
}
