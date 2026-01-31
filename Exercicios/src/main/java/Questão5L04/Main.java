/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão5L04;

/**
 *
 * @author Fernando
 */
public class Main {
    
    //metodo que recebe uma lista de midias heterogenias e executa 
    public static void exe(Midia[] midias){
        for(Midia md: midias){
            md.executar();
        }
    }
    
    public static void main(String[] args){
        Videos videos1 = new Videos();
        Videos videos2 = new Videos();
        Audio audio = new Audio();
        Animacao3D animacao1 = new Animacao3D();
        
        Midia[] midias = {videos1, videos2, audio, animacao1};
        
        Main.exe(midias);
    }
}
