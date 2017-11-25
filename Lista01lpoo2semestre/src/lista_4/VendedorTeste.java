/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista_4;
import javax.swing.JOptionPane;

/**
 *
 * @author Eduardo Mendes
 */
public class VendedorTeste {
    
    public static void main(String[] args){
	String nome = JOptionPane.showInputDialog("Nome do vendedor: ");
	int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
	double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura: "));
	String sexo = JOptionPane.showInputDialog("Sexo: ");
	double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
	double valor_vendas = Double.parseDouble(JOptionPane.showInputDialog("Valor das vendas: "));
	double comissao = Double.parseDouble(JOptionPane.showInputDialog("Valor da comissão: "));
		
            Vendedor V = new Vendedor(valor_vendas, comissao, salario,nome, sexo, idade, altura);
		
            JOptionPane.showMessageDialog(null, V.toString() + "\nSalário Total: " + V.obterLucros());
	}
}
    
