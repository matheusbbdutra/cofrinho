package cofre;

public class Euro extends Moeda{

    public Euro(double valor) {
        this.valor = valor;
    }
    @Override
    public void info() {
        System.out.println("Euro - " + valor);
    }

    @Override
    public void converter() {

    }

}
