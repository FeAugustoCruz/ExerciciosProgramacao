/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão1L05;

/**
 *
 * @author Fernando
 */
import java.util.ArrayList;
public class Caixa <T>{
    private T dado;
    
    public void guardar(T obj){
        dado = obj;
    }
    
    public T pegar(){
        return dado;
    } 
}
