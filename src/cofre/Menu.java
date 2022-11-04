package cofre;

import java.util.Scanner;

public class Menu {

    private Scanner scan;

    public Menu(){
        scan = new Scanner(System.in);
    }

    public void exibirMenu() {
        System.out.println("COFRINHO:");
        System.out.println("1-Adicionar moeda");
        System.out.println("2-Remover moeda");
        System.out.println("3-Listar moedas");
        System.out.println("4-Calcular valor total convertido para real");
        System.out.println("0-Encerrar");

        String  selecionado = scan.next();

        switch (selecionado){
            case "0":
                System.out.println("Sistema finalizado!");
                break;
            default:
                System.out.println("Opção inválida!");
                exibirMenu();
            case "1":
        }

    }

}
