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
public class Empregado extends Pessoa {
    
    double salario;

    public Empregado(double salario, String nome, String sexo, int idade, double altura) {
        super(nome, sexo, idade, altura);
        this.salario = salario;
    }

   

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double obterLucros(){
		return getSalario();
    }

    @Override
	public String toString(){
            return super.toString() + "\n" +
		"Tipo: " + getClass().getName();
	}

}