package cofre;

public class Dolar extends Moeda{

    public Dolar(double valor) {
        super(valor);
    }

    public Dolar () {} //Construtor vazio para poder iniciar o objeto sem necessitar de adicionar o valor diretamente.

    @Override
    public String info() {
        return "Dólar - $ " + valor;
    }

    @Override
    public double converter() {
        return valor * 5.30;
    }
}
