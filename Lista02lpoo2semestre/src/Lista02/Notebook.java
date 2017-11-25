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
public class Notebook extends DispositivosEletronicos{
    
    private String tipo;
    private double durBateria;
    private boolean bluetooth;
    private boolean telatouch;
    private boolean camera;

    public Notebook(String tipo, double durBateria, boolean bluetooth, boolean telatouch, boolean camera, String cor, String processador, double memram, double meminterna, double tamanhoTela, double alienergia, double resolTela) {
        super(cor, processador, memram, meminterna, tamanhoTela, alienergia, resolTela);
        this.tipo = tipo;
        this.durBateria = durBateria;
        this.bluetooth = bluetooth;
        this.telatouch = telatouch;
        this.camera = camera;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getDurBateria() {
        return durBateria;
    }

    public void setDurBateria(double durBateria) {
        this.durBateria = durBateria;
    }

    public boolean isBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(boolean bluetooth) {
        this.bluetooth = bluetooth;
    }

    public boolean isTelatouch() {
        return telatouch;
    }

    public void setTelatouch(boolean telatouch) {
        this.telatouch = telatouch;
    }

    public boolean isCamera() {
        return camera;
    }

    public void setCamera(boolean camera) {
        this.camera = camera;
    }
    
    
    
}
