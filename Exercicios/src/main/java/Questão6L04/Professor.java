/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão6L04;

/**
 *
 * @author Fernando
 */
public class Professor implements Autenticavel{

    @Override
    public boolean autenticar(String usuario, String senha){
        if(senha.matches("(?=.*\\p{Digit})(?=.*\\p{Upper}).+")){
            System.out.printf("Cadastro usuario %s aprovado! como professor\n", usuario);
            return true;
        }else{
            System.out.printf("Cadastro usuario %s reprovado! como professor\n", usuario);
            return false;
        }
    }
}
