package cofre;

public class Real extends Moeda{

    public Real(double valor) {
        this.valor = valor;
    }
    @Override
    public void info() {
        System.out.println("Real - " + valor);
    }

    @Override
    public void converter() {

    }
}
