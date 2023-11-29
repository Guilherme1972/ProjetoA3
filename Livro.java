/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mateus
 */
public class Livro {
    private int id;
    private String nome;
    
    public Livro(int id, String nome) {
        this.id = id;
        this.nome = nome;
                
    }
    
    public String toString() {
        return "Livro [id: " + id + ", nome: " + nome + "]";
    }
    
}
