/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão2L03;

/**
 *
 * @author Fernando
 */
public class Aluno extends Pessoa{
    private int matricula;
    
    public Aluno(int matricula, int idade, String nome){
        super(idade, nome);
        this.matricula = matricula;
    }
    
    public void exibirAluno(){
        exibirDados();
        System.out.println("Matricula: " + matricula);
    }
    
    public static void main(String[] args) {
        Aluno aluno = new Aluno(175383, 21, "Fernando");
        //aluno herda o metodo exibirAluno !
        aluno.exibirAluno();
    }
}
