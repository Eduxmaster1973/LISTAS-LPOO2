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
public class Fornecedor extends Pessoa {
    
    double creditoMaximo;
    double valorEmDivida;

    public Fornecedor(double creditoMaximo, double valorEmDivida, String nome, String sexo, int idade, double altura) {
        super(nome, sexo, idade, altura);
        this.creditoMaximo = creditoMaximo;
        this.valorEmDivida = valorEmDivida;
    }

    public double getCreditoMaximo() {
        return creditoMaximo;
    }

    public void setCreditoMaximo(double creditoMaximo) {
        this.creditoMaximo = creditoMaximo;
    }

    public double getValorEmDivida() {
        return valorEmDivida;
    }

    public void setValorEmDivida(double valorEmDivida) {
        this.valorEmDivida = valorEmDivida;
    }
    
    public double obterSaldo(){
	return getCreditoMaximo() - getValorEmDivida();
	}
	
	@Override
	public String toString(){
            return super.toString() + "\n" +
                "Tipo: " + getClass().getName() + "\n" +
		"Crédito Máximo: " + getCreditoMaximo() + "\n" +
		"Valor em Dívida: " + getValorEmDivida();
	}
    
}
