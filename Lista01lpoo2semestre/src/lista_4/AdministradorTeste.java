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
public class AdministradorTeste {
   
    public static void main(String[] args) {
		String nome = JOptionPane.showInputDialog("Nome do administrador: ");
		int idade = Integer.parseInt(JOptionPane.showInputDialog("Idade: "));
		double altura = Double.parseDouble(JOptionPane.showInputDialog("Altura:" ));
		String sexo = JOptionPane.showInputDialog("Sexo: ");
		double salario = Double.parseDouble(JOptionPane.showInputDialog("Salário: "));
		double ajudas_de_custo = Double.parseDouble(JOptionPane.showInputDialog("Valor de ajuda de custo: "));
		
		Administrador A = new Administrador(ajudas_de_custo, salario, nome, sexo, idade, altura );
		
		JOptionPane.showMessageDialog(null, A.toString() + "\nSalário total: " + A.obterLucros());
	}
}
