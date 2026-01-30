/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão3L04;

/**
 *
 * @author Fernando
 */
public class Tese implements Documentos{
    public String palavraChave;
    public String nome;
    public int paginas;
    
    public Tese(String palavraChave, String nome, int paginas){
        this.palavraChave = palavraChave;
        this.nome = nome;
        this.paginas = paginas;
    }
    
    @Override 
    public void abrir(){
        System.out.printf("A revista %s foi aberta!\n", this.nome);    }
    
    @Override
    public boolean buscarPorPalavraChave(String palavra){
        return this.palavraChave.equals(palavra);
        //System.out.printf("Livro com palavra-chave %s não encontrado!\n", palavra);
    
    }
    
    @Override
    public int obterNumerodePaginas(){
        return paginas;
    }
}   
