package cofre;

import java.util.ArrayList;
import java.util.Iterator;

public class Cofrinho {
    private ArrayList<Moeda> listaMoedas;

    public Cofrinho() {
        this.listaMoedas = new ArrayList<>();
    }

    public void adicionarMoeda(Moeda m) {
        this.listaMoedas.add(m);
    }

    public void removerMoeda(Moeda m) {
        this.listaMoedas.remove(m);
    }

    public void listarMoedas() {

        for(Moeda moeda : this.listaMoedas){
            moeda.info();
        }

    }


}
