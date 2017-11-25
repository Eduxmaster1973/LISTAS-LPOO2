/*
 * * Criação da Classe abstrata AluguelDeAutomovel com seus atributos, construtor e métodos conforme item 2 do exercício.
 */
package model;

/**
 *
 * @author Eduardo Mendes
 */
public abstract class AluguelDeAutomovel {
    
    private String tipodealuguel;
    private int perilocacao;
    private int diasdeatraso;
    private float multa;

    public AluguelDeAutomovel(String tipodealuguel, int perilocacao, int diasdeatraso, float multa) {
        this.tipodealuguel = tipodealuguel;
        this.perilocacao = perilocacao;
        this.diasdeatraso = diasdeatraso;
        this.multa = multa;
    }

    public String getTipodealuguel() {
        return tipodealuguel;
    }

    public void setTipodealuguel(String tipodealuguel) {
        this.tipodealuguel = tipodealuguel;
    }

    public int getPerilocacao() {
        return perilocacao;
    }

    public void setPerilocacao(int perilocacao) {
        this.perilocacao = perilocacao;
    }

    public int getDiasdeatraso() {
        return diasdeatraso;
    }

    public void setDiasdeatraso(int diasdeatraso) {
        this.diasdeatraso = diasdeatraso;
    }

    public float getMulta() {
        return multa;
    }

    public void setMulta(float multa) {
        this.multa = multa;
    }
    
    
}
