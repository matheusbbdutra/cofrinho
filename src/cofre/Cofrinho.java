package cofre;

import java.util.*;

public class Cofrinho {

    private List<Moeda> listaMoedas = new ArrayList<Moeda>();

    public Cofrinho(List<Moeda> listaMoedas) {
        this.listaMoedas = listaMoedas;
    }

    public Cofrinho() {}

    public void adicionarMoeda(List<Moeda> m) { //Função para adicionar moedas ao array listaMoedas
        this.listaMoedas = m;
    }

    public void removerMoeda(int m) { //Função para remover moedas ao array listaMoedas
        listaMoedas.remove(m);
    }

    public void listarMoedas() { //Função para percorrer as moedas existentes no array listaMoedas
        if (listaMoedas.isEmpty()) {
            System.out.println("O cofre ainda está vazio.");
        }

        for (int i = 0; i < this.listaMoedas.size(); i++) {
            System.out.println(this.listaMoedas.get(i));
        }
    }

    public double convertido() { //Função para converter os valores em reais das moedas adicionadas ao array listaMoedas
        double totalConvertido = 0;
        for (Moeda m : listaMoedas){
            totalConvertido += m.getValorConvertido();

        }
        return totalConvertido;
    }
}
