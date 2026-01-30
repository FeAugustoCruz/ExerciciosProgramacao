/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão3L04;

/**
 *
 * @author Fernando
 */
public class Main {
    public static void main(String[] args){
        Documentos livro1 = new Livros("Drama","Extraordinário", 310);
        Documentos revista1 = new Revista("Moda", "Avon", 40);
        Documentos tese1 = new Tese("Cientifica", "Metodes de...", 100);
        Documentos livro2 = new Livros("Drama", "Os suicidas", 400);
        
        Documentos[] documentos = {livro1, revista1, tese1, livro2};
        
        for(Documentos doc: documentos){
            if(doc.buscarPorPalavraChave("Drama")){
                doc.abrir();
            }
        }
    }
}
