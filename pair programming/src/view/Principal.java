/*
 * Criação da Classe Principal conforme item 1 do exercício.
Na Classe principal, no metodo Main criado o menu:
1. Cadastrar Pessoa
2. Cadastrar Automóvel
3. Criar aluguel
4. Sair (Implemente essa opção)

Foram criados 3 ArrayList onde serão adicionados os objetos cadastrados:
ArrayList <Pessoa> pessoas = new ArrayList<Pessoa>();
ArrayList <Automovel> automoveis = new ArrayList<Automovel>();
ArrayList <AluguelDeAutomóvel> alugueis = new ArrayList<AluguelDeAutomóvel>()

item 5 do exercício
 */
package view;

/**
 *
 * @author Eduardo Mendes
 */

import java.util.Scanner;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.AluguelDeAutomovel;
import model.Automovel;
import model.Pessoa;

public class Principal {
     public static void Main(String[] args){
         
         while (true){
            System.out.println("Escolha uma opção:/n"
                    + "1 - Cadastrar Pessoa/n"
                    + "2 - Cadastrar Automóvel/n"
                    + "3 - Criar Aluguel/n"
                    + "4 - Sair");
            Scanner sc = new Scanner(System.in);
            int resposta = sc.nextInt();
            ArrayList <Pessoa> pessoas= new ArrayList<Pessoa>();
            ArrayList <Automovel> automoveis= new ArrayList<Automovel>();
            ArrayList <AluguelDeAutomovel> alugueis= new ArrayList<AluguelDeAutomovel>();

            switch (resposta){
                case 1: String nome = JOptionPane.showInputDialog(null, "Nome: ");
                        String altura = JOptionPane.showInputDialog(null, "Altura: ");
                        double alturaDouble = Double.parseDouble(altura);
                        String idade = JOptionPane.showInputDialog(null, "Idade: ");
                        int idadeInt = Integer.parseInt(idade);
                        String sexo = JOptionPane.showInputDialog(null,"Sexo");
                        String cpf = JOptionPane.showInputDialog(null, "CPF");
                        int cpfInt = Integer.parseInt(cpf);
                        Pessoa p1 = new Pessoa(nome, alturaDouble, idadeInt, sexo, cpfInt);
                        pessoas.add(p1);
                    JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
                    break;
                case 2 : String marca = JOptionPane.showInputDialog(null, "Marca: ");
                    String modelo = JOptionPane.showInputDialog(null, "Modelo: ");
                    String ano = JOptionPane.showInputDialog(null, "Ano de Fabricação: ");
                    int anoInt = Integer.parseInt(ano);
                    String estado = JOptionPane.showInputDialog(null, "Automóvel novo ou usado?: ");
                    
                case 3: 
            }
        }
    }
}
    

