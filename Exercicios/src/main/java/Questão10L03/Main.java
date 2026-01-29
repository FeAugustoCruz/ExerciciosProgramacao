/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão10L03;

/**
 *
 * @author Fernando
 */
public class Main {
    public static void main(String[] args) {
        //instânciação dos objetos 
        Funcionario funcionario1 = new Horista(1614, "Felipe", 1, 100.00);
        Funcionario funcionario2 = new Assalariado(1614, "Julio");
        Funcionario funcionario3 = new Comissionado(1614, "Ana", 500.00);
        
        //System.out.println("O salario do horista e: " + funcionario1.calcularPagamento());
        
        //colocando os objetos no array funcionarios
        Funcionario funcionarios[] = {funcionario1, funcionario2, funcionario3};
        
        //Usando o for each
        for (Funcionario funcionario : funcionarios) {
            if (funcionario instanceof Horista) {
                System.out.printf("O salario do Horista %s e: %.2fR$\n", funcionario.getNome(), funcionario.calcularPagamento());
            } else if (funcionario instanceof Assalariado) {
                System.out.printf("O salario do Assalariado %s e: %.2fR$\n", funcionario.getNome(), funcionario.calcularPagamento());
            } else {
                System.out.printf("O salario do Comissionado %s e: %.2fR$\n", funcionario.getNome(), funcionario.calcularPagamento());
            }
        }
    }
}
