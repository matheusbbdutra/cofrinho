package cofre;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private Scanner scan;
    private Cofrinho cofre;
    List<Moeda> moedas = new ArrayList<Moeda>();

    public Menu(){
        scan = new Scanner(System.in);
        cofre = new Cofrinho();
    }

    public void exibirMenu() {

        System.out.println("COFRINHO:");
        System.out.println("1-Adicionar moeda");
        System.out.println("2-Remover moeda");
        System.out.println("3-Listar moedas");
        System.out.println("4-Calcular valor total convertido para real");
        System.out.println("0-Encerrar");
        System.out.print("Digite: ");
        String  selecionado = scan.next();


        switch (selecionado){
            case "0":
                System.out.println("Sistema finalizado!");
                break;
            default:
                System.out.println("Opção inválida!");
                exibirMenu();
            case "1":
                subMenuMoedas();
                String selecionadoDois = scan.next();

                switch(selecionadoDois){
                    default:
                        System.out.println("Você não escolheu nenhuma moeda válida.");
                        break;
                    case "1":
                        Real real = new Real();
                        System.out.print("Informe o valor:");
                        double moedaReal = scan.nextDouble();
                        real.setValor(moedaReal);
                        moedas.add(real);
                        cofre.adicionarMoeda(moedas);
                        break;
                    case "2":
                        Dolar dolar = new Dolar();
                        System.out.print("Informe o valor:");
                        double moedaDolar = scan.nextDouble();
                        dolar.setValor(moedaDolar);
                        moedas.add(dolar);
                        cofre.adicionarMoeda(moedas);
                        break;
                    case "3":
                        Euro euro = new Euro();
                        System.out.print("Informe o valor:");
                        double moedaEuro = scan.nextDouble();
                        euro.setValor(moedaEuro);
                        moedas.add(euro);
                        cofre.adicionarMoeda(moedas);
                        break;
                }
                exibirMenu();
            case "2":
                System.out.println("Informe amoeda que deseja remover: ");

                for (int i = 0; i < moedas.size(); i++) {
                    System.out.println("Indice: " + i + " -> " + moedas.get(i));
                }

                int moedaInformada = scan.nextInt();
                cofre.removerMoeda(moedaInformada);

            case "3":
                System.out.println();
                System.out.println("_______________");
                cofre.listarMoedas();
                System.out.println("_______________");
                exibirMenu();
        }

    }

    private void subMenuMoedas() {
        System.out.println("Escolha Moeda");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");
        System.out.print("Digite: ");
    }

}
