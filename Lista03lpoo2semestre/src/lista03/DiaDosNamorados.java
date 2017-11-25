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
public class DiaDosNamorados extends CartaoWeb {
    
    public DiaDosNamorados(String destinatario) {
		super(destinatario);
	}

	public String retornarMensagem(String remetente) {
		return "Querida " + this.getDestinatario() + ",\n"
				+ "Feliz dia dos namorados!\n"
				+ "A suprema felicidade da vida é ter a convicção de que somos amados.\n"
                                + "Porque nada melhor para a saúde que um amor correspondido.\n"
				+ "Com carinho,\n"
				+ remetente;
	}
    
}
