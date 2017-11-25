/*
 No pacote controller implementaçao da classe GerarAluguel, com metodos passando pelos objetos clientes, 
funcionários e automóveis e o tipo de aluguel. Gerado o objeto aluguelAutomovel (poderá ser diario ou 
mensal baseado no tipo do aluguel que será informado pelo usuário) o objetos alguelAutomovel gerado do tipo de retorno.

 */
package controller;

import model.AluguelDeAutomovel;
import model.Automovel;
import model.Cliente;
import model.Diaria;
import model.Mensal;

/**
 *
 * @author Eduardo Mendes
 */
public class GerarAluguel {
    public AluguelDeAutomovel aluguelAutomovel(Cliente cliente, Automovel automovel, String tipoaluguel){
            if(tipoaluguel == "Diaria"){
                Diaria diaria = new Diaria(cliente,automovel);
                diaria.setAutomovel(automovel);
                diaria.setPessoa(cliente);
                return diaria;
            }else if(tipoaluguel == "Mensal"){
                Mensal mensal = new Mensal(cliente,automovel);
                mensal.setAutomovel(automovel);
                mensal.setPessoa(cliente);
                return mensal;
            }
                
            System.out.println("Erro");
            AluguelDeAutomovel aluguel = null;
            return aluguel;
            
        }
}
    

