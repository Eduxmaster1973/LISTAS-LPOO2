/*
 * * Criação da Classe Funcionario com aplicação de herança da superclasse Pessoa com seus 
atributos, construtores e métodos conforme item 3 do exercício.
 */
package model;

/**
 *
 * @author Eduardo Mendes
 */
public class Funcionario extends Pessoa{
    private int funcao;
    private int matricula;

    public Funcionario(int cpf, int funcao, int matricula, String nome, float altura, int idade, String sexo) {
        super(nome, altura, idade, sexo);
        
        this.funcao = funcao;
        this.matricula = matricula;
    }


    public int getFuncao() {
        return funcao;
    }

    public void setFuncao(int funcao) {
        this.funcao = funcao;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    
    
}
