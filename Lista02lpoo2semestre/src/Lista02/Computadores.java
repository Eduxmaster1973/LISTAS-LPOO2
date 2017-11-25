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
public class Computadores extends DispositivosEletronicos{
    private String tipo;
    private int qHDMI;
    private int qUSB;
    private boolean placaSom;
    private boolean placavideo;

    public Computadores(String tipo, int qHDMI, int qUSB, boolean placaSom, boolean placavideo, String cor, String processador, double memram, double meminterna, double tamanhoTela, double alienergia, double resolTela) {
        super(cor, processador, memram, meminterna, tamanhoTela, alienergia, resolTela);
        this.tipo = tipo;
        this.qHDMI = qHDMI;
        this.qUSB = qUSB;
        this.placaSom = placaSom;
        this.placavideo = placavideo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getqHDMI() {
        return qHDMI;
    }

    public void setqHDMI(int qHDMI) {
        this.qHDMI = qHDMI;
    }

    public int getqUSB() {
        return qUSB;
    }

    public void setqUSB(int qUSB) {
        this.qUSB = qUSB;
    }

    public boolean isPlacaSom() {
        return placaSom;
    }

    public void setPlacaSom(boolean placaSom) {
        this.placaSom = placaSom;
    }

    public boolean isPlacavideo() {
        return placavideo;
    }

    public void setPlacavideo(boolean placavideo) {
        this.placavideo = placavideo;
    }

}