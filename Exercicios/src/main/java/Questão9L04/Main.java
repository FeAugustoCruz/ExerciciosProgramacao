/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão9L04;

/**
 *
 * @author Fernando
 */
public class Main {
    public static void main(String[] args){
        InteligenciaArtificial ai1 = new InteligenciaPerseguidora();
        InteligenciaArtificial ai2 = new InteligenciaAliada();
        
        InteligenciaArtificial[] inteligencias = {ai1, ai2};
        
        for(InteligenciaArtificial ias: inteligencias){
            ias.atualizar();//DEMONSTANDO O POLIMORFISMO
        }
    }
}
