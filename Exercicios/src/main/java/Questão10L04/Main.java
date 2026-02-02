/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão10L04;

/**
 *
 * @author Fernando
 */
public class Main {
    public static void main(String[] args){
        Descontavel item1 = new ProdutoFisico(43.54);
        Descontavel item2 = new ProdutoFisico(12.99);
        ItemVenda item3 = new ProdutoDigital(1.99);
        ItemVenda item4 = new ServicoAssinatura(54.89, 10);
        ItemVenda item5 = new ServicoAssinatura(23.99, 7);
        
        ItemVenda[] itens = {item1, item2, item3, item4, item5};
        
        for(ItemVenda its: itens){
            if(its instanceof Descontavel){
                //type casting de 'its'
                Descontavel i = (Descontavel) its;
                System.out.printf("O valor com desconto e: %.2f R$\n", i.getPrecoComDesconto());
            }else{
                System.out.printf("O valor e: %.2f R$\n", its.getPreco());
            }
            
        }
    }
}
