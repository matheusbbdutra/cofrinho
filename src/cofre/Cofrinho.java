package cofre;

import java.util.ArrayList;

public class Cofrinho {
    private ArrayList<Moeda> listaMoedas;

    public Cofrinho() {
        this.listaMoedas = new ArrayList<Moeda>();
    }

    public void adicionarMoeda(Moeda m) {
        this.listaMoedas.add(m);
    }

    public void removerMoeda(Moeda m) {
        this.listaMoedas.remove(m);
    }

    public void listarMoedas() {

        if (listaMoedas.isEmpty()) {
            System.out.println("O cofre ainda está vazio.");
            return;
        }

        for(Moeda moeda : listaMoedas)
        {
            moeda.info();
        }
    }


}
