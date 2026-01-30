/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão3L04;

/**
 *
 * @author Fernando
 */
public class Livros implements Documentos{
    private String palavraChave;
    private String nome;
    private int paginas;
    
    public Livros(String palavraChave, String nome, int paginas){
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
        //System.out.printf("Livro com palavra-chave %s não encontrado!", palavra);
    }
    
    @Override
    public int obterNumerodePaginas(){
       return this.paginas;
    }
}
