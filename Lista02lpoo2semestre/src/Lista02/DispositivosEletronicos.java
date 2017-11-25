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
public class DispositivosEletronicos {
    private String cor;
    private String processador;
    private double memram;
    private double meminterna;
    private double tamanhoTela;
    private double alienergia;
    private double resolTela;

    public DispositivosEletronicos(String cor, String processador, double memram, double meminterna, double tamanhoTela, double alienergia, double resolTela) {
        this.processador = processador;
        this.memram = memram;
        this.meminterna = meminterna;
        this.tamanhoTela = tamanhoTela;
        this.alienergia = alienergia;
        this.resolTela = resolTela;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getProcessador() {
        return processador;
    }

    public void setProcessador(String processador) {
        this.processador = processador;
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

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    public double getAlienergia() {
        return alienergia;
    }

    public void setAlienergia(double alienergia) {
        this.alienergia = alienergia;
    }

    public double getResolTela() {
        return resolTela;
    }

    public void setResolTela(double resolTela) {
        this.resolTela = resolTela;
    }
    
    
    
    
}
