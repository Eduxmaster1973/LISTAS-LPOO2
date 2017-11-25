/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lista03;

/**
 *
 * @author Eduardo Mendes
 */
public class Natal extends CartaoWeb {
    
    public Natal (String destinatario) {
		super(destinatario);
	}

	public String retornarMensagem(String remetente) {
		return "Amigo(a) " + this.getDestinatario() + ",\n" 
                            + "Que neste Natal, Deus abençoe sua família!\n" 
                            + "Dando muita saúde e paz!\n" 
                            + "Abraço!\n" 
                            + remetente;
        }
    
}
