
package lista_4;


public class Cachorro extends Animal{
    private String raca;
    private String nome;

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Cachorro(String raca, String nome, String cor, String tipo) {
        super(cor, tipo);
        this.raca = raca;
        this.nome = nome;
    }

    @Override
    public String toString() {
        return super.toString() + "Cachorro{" + "raca=" + raca + ", nome=" + nome + '}';
    }
    
}
    
    

