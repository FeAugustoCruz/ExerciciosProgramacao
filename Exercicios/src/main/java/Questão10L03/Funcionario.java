/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão10L03;

/**
 *
 * @author Fernando
 */
abstract class Funcionario {
        private double salarioBase;
        private String nome;
        
        public Funcionario(String nome, double salarioBase){
            this.nome = nome;
            this.salarioBase = salarioBase;
        }
        
        public abstract double calcularPagamento();
        
        public String getNome(){
            return nome;
        }
        
        public double getSalarioBase(){
            return salarioBase;
        }
}
