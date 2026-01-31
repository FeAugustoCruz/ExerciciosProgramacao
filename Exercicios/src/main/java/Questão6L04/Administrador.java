/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão6L04;

/**
 *
 * @author Fernando
 */
public class Administrador implements Autenticavel{
    
    @Override
    public boolean autenticar(String usuario, String senha){
        //"?=.*" -> regex code para pelo menos um!
        //".+" -> ragex code para tamanho minimo!
        if(senha.matches("(?=.*\\p{Digit})(?=.*\\p{Upper})(?=.*\\p{Punct}).+")){
            System.out.printf("Cadastro usuario %s aprovado! como Administrador\n", usuario);
            return true;
        }else{
            System.out.printf("Cadastro usuario %s reprovado! como Administrador\n", usuario);
            return false;
        }
    }
}
