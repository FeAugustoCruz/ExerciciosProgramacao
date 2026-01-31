/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão7L04;

/**
 *
 * @author Fernando
 */
public class Main {
    public static void main(String[] args){
        Sensor sensorTem1 = new Temperatura();
        Sensor sensorTem2 = new Temperatura();
        Sensor sensorUmi1 = new Umidade();
        Sensor sensorAr1 = new QualidadedoAr();
        
        Sensor[] coletor = {sensorTem1, sensorTem2, sensorUmi1, sensorAr1};
        
        for(Sensor col: coletor){
            col.coletarDados();
        }
    
    }
}
