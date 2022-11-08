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


    public void exibirMenu() { //função principal da classe Menu, onde realizamos as escolhas


        System.out.println("COFRINHO:");
        System.out.println("1-Adicionar moeda");
        System.out.println("2-Remover moeda");
        System.out.println("3-Listar moedas");
        System.out.println("4-Calcular valor total convertido para real");
        System.out.println("0-Encerrar");
        System.out.print("Digite: ");

        String  selecionado = scan.next();


        switch (selecionado){
            default:
                System.out.println("Opção inválida!");
                exibirMenu();
            case "0":
                parar();
                break;
            case "1":
                subMenuMoedas();
                menuAdd();
                exibirMenu();
                break;
            case "2":
                menuRemove();
                exibirMenu();
                break;
            case "3":
                System.out.println();
                System.out.println("_______________");
                cofre.listarMoedas();
                System.out.println("_______________");
                exibirMenu();
                break;
            case "4":
                calularTudo();
                exibirMenu();
                break;
        }

    }

    private void subMenuMoedas() { //função privada para listar as moedas disponiveis, sendo executada apenas pela classe exibirMenu
        System.out.println("Escolha Moeda");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");
        System.out.print("Digite: ");
    }

    private void menuAdd() { //Função privada para receber a escolha da moeda, onde chamará e ira inserir as funções referente a moeda escolhida, sendo executada apenas pela classe exibirMenu
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
    }

    private void menuRemove() { //Função privada para listar as moedas disponiveis para ser removida do Array de moedas, sendo executada apenas pela classe exibirMenu
        System.out.println("Informe a moeda que deseja remover: ");

        for (int i = 0; i < moedas.size(); i++) {
            System.out.println("Indice: " + i + " -> " + moedas.get(i));
        }

        int moedaInformada = scan.nextInt();

        cofre.removerMoeda(moedaInformada);

        try {
            if(moedaInformada < 0 || moedaInformada > moedas.size())
                System.out.println("Índice da moeda invalido");
        } catch (Exception e) {
            System.out.println("\n Ocorreu um problema: "+ e.getMessage());
        } finally {
            System.out.println("\n Moeda removida!");
        }
    }

    private void parar() {
        System.out.println("Sistema finalizado!");
    }

    private void calularTudo() { //Função privada para calcular os valores adicionados ao cofre em reais, sendo executada apenas pela classe exibirMenu
        System.out.println("---------- Total do Cofrinho ------------\n");
        System.out.println("Total convertido: R$ " + cofre.convertido() + "\n");
    }



}
