package cofre;

import java.util.Scanner;

public class Menu {

    private Scanner scan;
    private Cofrinho cofre;

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
                listaMoedas();
                exibirMenu();
            case "3":
                cofre.listarMoedas();
        }

    }

    private void listaMoedas() {

        System.out.println("Escolha Moeda");
        System.out.println("1 - Real");
        System.out.println("2 - Dólar");
        System.out.println("3 - Euro");
        System.out.print("Digite: ");
        String  selecionado = scan.next();

        switch(selecionado){
            default:
                System.out.println("Você não escolheu nenhuma moeda válida.");
                break;
            case "1":
                System.out.print("Informe o valor:");
                double moedaReal = scan.nextDouble();
                Real real = new Real(moedaReal);
                cofre.adicionarMoeda(real);
                break;
            case "2":
                System.out.print("Informe o valor:");
                double moedaDolar = scan.nextDouble();
                Dolar dolar = new Dolar(moedaDolar);
                cofre.adicionarMoeda(dolar);
                break;
            case "3":
                System.out.print("Informe o valor:");
                double moedaEuro = scan.nextDouble();
                Euro euro = new Euro(moedaEuro);
                cofre.adicionarMoeda(euro);
                break;
        }


    }
}
