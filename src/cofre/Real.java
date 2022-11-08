package cofre;

public class Real extends Moeda{

    public Real(double valor) {
        super(valor);
    }

    public Real() {}

    @Override
    public String info() {
       return "Real - R$ " + valor;
    }


    @Override
    public double converter() {
        return this.valor;
    }
}
