/*
 * * Criação da Classe Caminhao com aplicação de herança da superclasse Automovel com seus 
atributos, construtores e métodos conforme item 3 do exercício.
 */
package model;

/**
 *
 * @author Eduardo Mendes
 */
public class Caminhao extends Automovel{
    private String tipodecarga;
    private float capacidadecarga;
    private String tipocarroceria;

    public Caminhao(String tipodecarga, float capacidadecarga, String tipocarroceria, String marca, String modelo, int ano, String estado) {
        super(marca, modelo, ano, estado);
        this.tipodecarga = tipodecarga;
        this.capacidadecarga = capacidadecarga;
        this.tipocarroceria = tipocarroceria;
    }

    public String getTipodecarga() {
        return tipodecarga;
    }

    public void setTipodecarga(String tipodecarga) {
        this.tipodecarga = tipodecarga;
    }

    public float getCapacidadecarga() {
        return capacidadecarga;
    }

    public void setCapacidadecarga(float capacidadecarga) {
        this.capacidadecarga = capacidadecarga;
    }

    public String getTipocarroceria() {
        return tipocarroceria;
    }

    public void setTipocarroceria(String tipocarroceria) {
        this.tipocarroceria = tipocarroceria;
    }
    
    
}
