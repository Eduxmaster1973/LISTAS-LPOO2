/*
 * * Criação da Classe Automovel com seus atributos, construtor e métodos conforme item 2 do exercício.
 */
package model;

/**
 *
 * @author Eduardo Mendes
 */
public class Automovel {
    
    private String marca;
    private String modelo;
    private int ano;
    private String estado;

    public Automovel(String marca, String modelo, int ano, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.estado = estado;
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

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
    
}
