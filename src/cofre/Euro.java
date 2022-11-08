package cofre;

public class Euro extends Moeda{

    public Euro(double valor) {
        super(valor);
    }

    public Euro() {} //Construtor vazio para poder iniciar o objeto sem necessitar de adicionar o valor diretamente.

    @Override
    public String info() {
        return "Euro - € " + valor;
    }

    @Override
    public double converter() {
        return valor * 5.25;
    }
}
