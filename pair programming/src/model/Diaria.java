/*
 * * Criação da Classe Diaria com aplicação de herança da superclasse AluguelDeAutomovel com seus 
atributos, construtor e métodos conforme item 3 do exercício.
 */
package model;

/**
 *
 * @author Eduardo Mendes
 */
public class Diaria extends AluguelDeAutomovel{
    private float valordiaria;
    private Pessoa pessoa;
    private Automovel automovel;

    public Diaria(float valordiaria, Pessoa pessoa, Automovel automovel, String tipodealuguel, int perilocacao, int diasdeatraso, float multa) {
        super(tipodealuguel, perilocacao, diasdeatraso, multa);
        this.valordiaria = valordiaria;
        this.pessoa = pessoa;
        this.automovel = automovel;
    }

    public Diaria(Cliente cliente, Automovel automovel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public float getValordiaria() {
        return valordiaria;
    }

    public void setValordiaria(float valordiaria) {
        this.valordiaria = valordiaria;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public Automovel getAutomovel() {
        return automovel;
    }

    public void setAutomovel(Automovel automovel) {
        this.automovel = automovel;
    }
    
            
    
}
