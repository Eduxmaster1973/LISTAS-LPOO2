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
public class TefefoneMovel extends DispositivosTelefonia{
    
    private String categoria;
    private String marca;
    private String modelo;
    private double tamanhoTela;
    private double memram;
    private double meminterna;
    private String processador;

    public TefefoneMovel(String categoria, String marca, String modelo, double tamanhoTela, double memram, double meminterna, String processador, String formato, String cor) {
        super(formato, cor);
        this.categoria = categoria;
        this.marca = marca;
        this.modelo = modelo;
        this.tamanhoTela = tamanhoTela;
        this.memram = memram;
        this.meminterna = meminterna;
        this.processador = processador;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public double getMemram() {
        return memram;
    }

    public void setMemram(double memram) {
        this.memram = memram;
    }

    public double getMeminterna() {
        return meminterna;
    }

    public void setMeminterna(double meminterna) {
        this.meminterna = meminterna;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
    }
    
    
    
}
