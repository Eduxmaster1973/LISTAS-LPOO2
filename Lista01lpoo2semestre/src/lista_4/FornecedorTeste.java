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
public class FornecedorTeste {
         String nome = JOptionPane.showInputDialog("Nome do fornecedor: ");
         int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade:" ));
         double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
         String sexo = JOptionPane.showInputDialog("Sexo: ");
         double creditoMaximo = Double.parseDouble(JOptionPane.showInputDialog("O crédito máximo disponível: "));
         double valorEmDivida = Double.parseDouble(JOptionPane.showInputDialog("O valor em dívida: "));

		Fornecedor f1 = new Fornecedor(creditoMaximo, valorEmDivida,nome, sexo, idade, altura);
		
		double saldo = f1.obterSaldo();
		
		JOptionPane.showMessageDialog(null, f1.toString() + "\nSaldo: R$ " + saldo));
	
}
    

