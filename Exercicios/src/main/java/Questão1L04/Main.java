/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão1L04;

/**
 *
 * @author Fernando
 */

//Lembre-se que: Uma referência do tipo de uma interface pode apontar para
//qualquer objeto cuja classe implemente essa interface.!!
public class Main {
    public static void main(String[] args){
        Scannerl scn = new Scannerl();
        Webcam wab = new Webcam();
        Impressora impre = new Impressora();
        
        Conectavel[] conectaveis = {scn, wab, impre};
        
        //conectando dispositivos 
        for(Conectavel c: conectaveis){
            c.conectar();
        }
        
        for (Conectavel d: conectaveis){
            d.desconectar();
        }
    }
}
