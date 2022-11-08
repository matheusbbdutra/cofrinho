package cofre;

import java.util.*;

public class Cofrinho {

    private List<Moeda> listaMoedas = new ArrayList<Moeda>();

    public Cofrinho(List<Moeda> listaMoedas) {
        this.listaMoedas = listaMoedas;
    }

    public Cofrinho() {}

    public void adicionarMoeda(List<Moeda> m) {
        this.listaMoedas = m;
    }

    public void removerMoeda(int m) {
        listaMoedas.remove(m);
    }

    public void listarMoedas() {

        if (listaMoedas.isEmpty()) {
            System.out.println("O cofre ainda está vazio.");
        }

        for (int i = 0; i < this.listaMoedas.size(); i++) {
            System.out.println(this.listaMoedas.get(i));
        }
    }


}
