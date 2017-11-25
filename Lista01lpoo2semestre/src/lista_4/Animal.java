
package lista_4;


public class Animal {
    private String cor;
    private String tipo;

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

    public Animal(String cor, String tipo) {
        this.cor = cor;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Animal{" + "cor=" + cor + ", tipo=" + tipo + '}';
    }
    
    
}
