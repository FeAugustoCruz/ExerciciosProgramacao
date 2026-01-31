/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão6L04;

/**
 *
 * @author Fernando
 */
public class Aluno implements Autenticavel{
  
    @Override
    public boolean autenticar(String senha, String usuario){
        if(senha.matches("(?=.*\\p{Digit})(?=.*\\p{Upper}).+")){
            System.out.printf("Cadastro usuario %s aprovado! como aluno\n", usuario);
            return true;
        }else{
            System.out.printf("Cadastro usuario %s reprovado! como aluno\n", usuario);
            return false;
        }
    }
}
