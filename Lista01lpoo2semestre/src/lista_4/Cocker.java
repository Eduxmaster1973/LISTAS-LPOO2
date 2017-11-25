
package lista_4;


public class Cocker extends Cachorro{
  
    private boolean tosa;

    public Cocker(String raca, String nome, String cor, String tipo) {
        super(raca, nome, cor, tipo);
    }


    public boolean precisaTosa(){  
        return tosa;
    }

    public void setTosa(boolean tosa) {
        this.tosa = tosa;
    }

    @Override
    public String toString() {
        return super.toString() + "Cocker{" + "tosa=" + tosa + '}';
    }

}
