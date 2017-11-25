//*
 /* * Criação da Classe Carro com aplicação de herança da superclasse Automovel com seus 
atributos, construtor e métodos conforme item 3 do exercício.
 */
package model;

/**
 *
 * @author Eduardo Mendes
 */
public class Carro extends Automovel {
    private String cor;
    private String tipo;
    private int ocupantes;
    private int nportas;

    public Carro(String cor, String tipo, int ocupantes, String marca, String modelo, int ano, String estado) {
        super(marca, modelo, ano, estado);
        this.cor = cor;
        this.tipo = tipo;
        this.ocupantes = ocupantes;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getOcupantes() {
        return ocupantes;
    }

    public void setOcupantes(int ocupantes) {
        this.ocupantes = ocupantes;
    }

    public int getNportas() {
        return nportas;
    }

    public void setNportas(int nportas) {
        this.nportas = nportas;
    }
    
    
}
