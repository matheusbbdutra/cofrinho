package cofre;

public abstract class Moeda {

    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public Moeda() {}

    public  abstract String info();

    public abstract double converter() ;

    public double getValorConvertido() {
        return converter();
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return info();
    }
}
