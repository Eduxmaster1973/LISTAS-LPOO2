/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista02;

/**
 *
 * @author Eduardo Mendes
 */
public class TelefoneFixo extends DispositivosTelefonia{
    private String tipo;
    private String teclado;
    private double metragemFio;

    public TelefoneFixo(String tipo, String teclado, double metragemFio, String formato, String cor) {
        super(formato, cor);
        this.tipo = tipo;
        this.teclado = teclado;
        this.metragemFio = metragemFio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTeclado() {
        return teclado;
    }

    public void setTeclado(String teclado) {
        this.teclado = teclado;
    }

    public double getMetragemFio() {
        return metragemFio;
    }

    public void setMetragemFio(double metragemFio) {
        this.metragemFio = metragemFio;
    }
    
    
    
    
}
