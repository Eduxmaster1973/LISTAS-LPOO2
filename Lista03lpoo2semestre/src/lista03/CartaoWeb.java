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
public abstract class CartaoWeb {
    private String destinatario;

    public CartaoWeb(String destinatario) {
        this.destinatario = destinatario;
    }
    public abstract String retornarMensagem(String remetente);
    
    public String getDestinatario() {
        return destinatario;
    }

    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }
    
    
    
}
