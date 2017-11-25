//*
 /* * Criação da Classe Cliente com aplicação de herança da superclasse Pessoa com seus 
atributos, construtores e métodos conforme item 3 do exercício.
 */
package model;

/**
 *
 * @author Eduardo Mendes
 */
public class Cliente extends Pessoa{
    private String cnh;
    private float renda;
    private String endereco;

    public Cliente(String cnh, float renda, String endereco, String nome, float altura, int idade, String sexo) {
        super(nome, altura, idade, sexo);
        this.cnh = cnh;
        this.renda = renda;
        this.endereco = endereco;
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public float getRenda() {
        return renda;
    }

    public void setRenda(float renda) {
        this.renda = renda;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
    
    

}