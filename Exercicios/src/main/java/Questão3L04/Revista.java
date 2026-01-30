/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Questão3L04;

/**
 *
 * @author Fernando
 */
public class Revista implements Documentos{
    private String nome;
    private String palavraChave;
    private int paginas;
    
    public Revista(String palavraChave, String nome, int paginas){
        this.nome = nome;
        this.palavraChave = palavraChave;
        this.paginas = paginas;
    }
    
    @Override
    public void abrir(){
        System.out.printf("A revista %s foi aberta!\n", this.nome);
    }
    
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
