/*
 * * Criação da Classe Pesssoa com seus atributos, construtor e métodos conforme item 2 do exercício.
 */
package model;

/**
 *
 * @author Eduardo Mendes
 */
public class Pessoa {
    private String nome;
    private double altura;
    private int idade;
    private String sexo;
    private int cpf;

    public Pessoa(String nome, double altura, int idade, String sexo, int cpf) {
        this.nome = nome;
        this.altura = altura;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

  
    
    
}
