package cofre;

public abstract class Moeda {

    protected double valor;

    public Moeda(double valor) {
        this.valor = valor;
    }

    public Moeda() {} //Construtor vazio para poder iniciar o objeto sem necessitar de adicionar o valor diretamente.

    public  abstract String info(); //Função para a moeda e o valor

    public abstract double converter() ; //Função para converter o valor em reais

    public double getValorConvertido() { //Função para pegar os valores
        return converter();
    }

    public void setValor(double valor) { //Função para inserir o valor
        this.valor = valor;
    }

    @Override
    public String toString() { //Função para sobrescrever o metodo toString que será utilizado pelo metodo get utilizado no for localizado no cofrinho e na função menuRemove em Menu
        return info();
    }
}
