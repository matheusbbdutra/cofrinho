package cofre;

public class Dolar extends Moeda{

    public Dolar(double valor) {
        this.valor = valor;
    }
    @Override
    public void info() {
        System.out.println("Dólar - " + valor);
    }

    @Override
    public void converter() {

    }
}
