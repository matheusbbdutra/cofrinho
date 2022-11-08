package cofre;

public class Real extends Moeda{

    public Real(double valor) {
        super(valor);
    }

    public Real() {} //Construtor vazio para poder iniciar o objeto sem necessitar de adicionar o valor diretamente.

    @Override
    public String info() {
       return "Real - R$ " + valor;
    }

    @Override
    public double converter() {
        return this.valor;
    }
}
