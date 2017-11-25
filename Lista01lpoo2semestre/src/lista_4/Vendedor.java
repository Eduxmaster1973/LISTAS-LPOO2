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
public class Vendedor extends Empregado{
    
    double valorVendas;
    double comissao;

    public Vendedor(double valorVendas, double comissao, double salario, String nome, String sexo, int idade, double altura) {
        super(salario, nome, sexo, idade, altura);
        this.valorVendas = valorVendas;
        this.comissao = comissao;
    }

    public double getValorVendas() {
        return valorVendas;
    }

    public void setValorVendas(double valorVendas) {
        this.valorVendas = valorVendas;
    }

    public double getComissao() {
        return comissao;
    }

    public void setComissao(double comissao) {
        this.comissao = comissao;
    }
    
    public double obterLucros(){
	return super.obterLucros() + (getValorVendas() * (getComissao() / 100));
    }
	
    @Override
	public String toString(){
            return super.toString() + "\n" +
		"Salário: " + getSalario() + "\n" +
		"Comissão: " + (getValorVendas() * (getComissao() / 100));
	}
}
