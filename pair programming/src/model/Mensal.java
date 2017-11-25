/*
 * * Criação da Classe Mensal com aplicação de herança da superclasse AluguelDeAutomovel com seus 
atributos, construtor e métodos conforme item 3 do exercício.
 */
package model;

/**
 *
 * @author Eduardo Mendes
 */
public class Mensal extends AluguelDeAutomovel{
    private float valorMensal;
    private Pessoa pessoa;
    private Automovel automovel;

    public Mensal(float valorMensal, Pessoa pessoa, Automovel automovel, String tipodealuguel, int perilocacao, int diasdeatraso, float multa) {
        super(tipodealuguel, perilocacao, diasdeatraso, multa);
        this.valorMensal = valorMensal;
        this.pessoa = pessoa;
        this.automovel = automovel;
    }

    public Mensal(Cliente cliente, Automovel automovel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public float getValorMensal() {
        return valorMensal;
    }

    public void setValorMensal(float valorMensal) {
        this.valorMensal = valorMensal;
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
