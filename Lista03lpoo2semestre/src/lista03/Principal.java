/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

import javax.swing.JOptionPane;
import lista03.CartaoWeb;
import lista03.Aniversario;
import lista03.DiaDosNamorados;
import lista03.Natal;

/**
 *
 * @author Eduardo Mendes
 */
public class Principal {
    
    public static void main(String[] args){
		CartaoWeb[] cartoes;
		cartoes = new CartaoWeb[3];

		String remetente = JOptionPane.showInputDialog("Nome do remetente: ");
		String destinatario = JOptionPane.showInputDialog("Nome do destinatário: ");
		
		cartoes[0] = new Aniversario(destinatario);
		cartoes[1] = new DiaDosNamorados(destinatario);
		cartoes[2] = new Natal(destinatario);
		String[] titulo = new String[3];
		titulo[0] = "Aniversario";
		titulo[1] = "Dia dos Namorados";
		titulo[2] = "Natal";
		
		for(int i = 0; i < cartoes.length; i++){
		JOptionPane.showMessageDialog(null, cartoes[i].retornarMensagem (remetente), titulo[i], JOptionPane.PLAIN_MESSAGE);
		}
	}
    
}
