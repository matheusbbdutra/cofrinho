package cofre;

public class Dolar extends Moeda{

    public Dolar(double valor) {
        super(valor);
    }

    public Dolar () {}

    @Override
    public String info() {
        return "Dólar - $ " + valor;
    }



    @Override
    public double converter() {
        return valor * 5.30;
    }
}
