/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão11L05;

/**
 *
 * @author Fernando
 */
import java.util.ArrayList;
import java.util.Comparator;
public class Par<K, V> implements Comparable<Par>{
    private K key;
    private V value;
    
    public Par(K key, V value){
        this.key = key;
        this.value = value;
    }
    
    public V getValue(){
        return value;
    }
    
    @Override
    public String toString(){
        return "Valor: " + this.value + "Chave: " + this.key;
    }
    
    @Override
    public int compareTo(Par par){
        return Integer.compare((Integer)this.value,(Integer)par.getValue());
    } 
    
}
