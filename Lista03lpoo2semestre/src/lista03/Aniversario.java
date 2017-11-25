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
public class Aniversario extends CartaoWeb {
        
    public Aniversario(String destinatario){
		super(destinatario);
	}
	
	public String retornarMensagem(String remetente){
		return "Amigo(a) " + this.getDestinatario() + ",\n" 
                        + "Que esta data se repita muitas vezes!\n" 
                        + "Desejo a você muita saúde porque as demais coisas conquistamos.\n" 
                        + "Aguardando a festa!\n"
                        + "Abraço,\n"
                        + remetente;
	}
    
}
