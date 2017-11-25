
package lista_4;

import javax.swing.JOptionPane;

public class CockerTeste {
    
  public static void main (String[] args){
      String raca=JOptionPane.showInputDialog("Qual a raça do cachorro?");
      String tipo= JOptionPane.showInputDialog("Qual o tipo do cachorro?");
      String cor= JOptionPane.showInputDialog("Qual a cor do cachorro?");
      String nome= JOptionPane.showInputDialog("Qual o nome do cachorro?");
      boolean tosa= Boolean.parseBoolean(JOptionPane.showInputDialog("O Cachorro precisa de tosa?"));
      
      Cocker C = new Cocker(raca, nome, cor,tipo);
      C.setTosa (tosa);
      JOptionPane.showMessageDialog(null, C.toString());
  }  
    
}
