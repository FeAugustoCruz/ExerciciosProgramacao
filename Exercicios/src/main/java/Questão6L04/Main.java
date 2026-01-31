/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão6L04;

/**
 *
 * @author Fernando
 */
public class Main {
    public static void main(String[] args){
    
        Administrador adm1 = new Administrador();
        Administrador adm2 = new Administrador();
        Professor prof1 = new Professor();
        Professor prof2 = new Professor();
        Aluno aluno1 = new Aluno();
        
        Autenticavel[] autenticaveis = {adm1, adm2, prof1, prof2, aluno1};
        
        for(Autenticavel alt: autenticaveis){
            alt.autenticar("Vitor", "teste123");
        }
    
    }
}
