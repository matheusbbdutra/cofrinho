package cofre;

public class Euro extends Moeda{

    public Euro(double valor) {
        super(valor);
    }

    public Euro() {}

    @Override
    public String info() {
        return "Euro - € " + valor;
    }

    @Override
    public double converter() {
        return this.valor * 5.25;
    }
}
