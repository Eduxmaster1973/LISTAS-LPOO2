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
public class EmpregadoTeste {
    
	public static void main(String[] args) {
            String nome = JOptionPane.showInputDialog("Nome do empregado: ");
            String sexo = JOptionPane.showInputDialog("Sexo:");
            int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade de :"));
            double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:"));
            double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
		
		Empregado E = new Empregado(salario, nome, sexo, idade, altura);
                E.setSalario (salario);
		
		JOptionPane.showMessageDialog(null, E.toString() + "\nSalário: " + E.obterLucros());
	}
}
    

