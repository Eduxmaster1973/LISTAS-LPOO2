/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_4;

/**
 *
 * @author Eduardo Mendes
 */
public class Pessoa {
    
    String nome;
    String sexo;
    int idade;
    double altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public Pessoa(String nome, String sexo, int idade, double altura) {
        this.nome = nome;
        this.sexo = sexo;
        this.idade = idade;
        this.altura = altura;
    }
    
    @Override
	public String toString(){
		return "Nome: " + getNome() + "\n" +
                        "Idade: " + getIdade() + "\n" +
			"Altura: " + getAltura() + "\n" +
			"Sexo: " + getSexo();
	}
    
}
