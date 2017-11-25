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
public class Administrador extends Empregado {
    
    Double ajudasDeCusto;

    public Administrador(Double ajudasDeCusto, double salario, String nome, String sexo, int idade, double altura) {
        super(salario, nome, sexo, idade, altura);
        this.ajudasDeCusto = ajudasDeCusto;
    }

    public Double getAjudasDeCusto() {
        return ajudasDeCusto;
    }

    public void setAjudasDeCusto(Double ajudasDeCusto) {
        this.ajudasDeCusto = ajudasDeCusto;
    }
    
    public double obterLucros(){
		return super.obterLucros() + getAjudasDeCusto();
    }
	
	@Override
	public String toString(){
		return super.toString() + "\n" +
                    "Salário: " + getSalario() + "\n" +
                    "Ajudas de custo: " + getAjudasDeCusto();
    }
    
}
