package atividade5;

public class Pessoa {
    
    String nome;
    String endereco;
    
    Pessoa(String nome, String endereco){
        this.nome = nome;
        this.endereco = endereco;
    }
    
    public String getNome(){
        return this.nome;
    }
    
    public String getEndereco(){
        return this.endereco;
    }
    
    public String toString(){
        return this.getClass()+" {Nome: "+this.nome+" | Endereço: "+this.endereco+"}";
    }
}
