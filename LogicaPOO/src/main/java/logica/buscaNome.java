package logica;

import java.util.Scanner;

public class buscaNome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] nomes = new String[10];

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Digite o nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        System.out.print("Digite o nome a ser pesquisado: ");
        String nomeBusca = scanner.nextLine();

        boolean encontrado = false;
        for (int i = 0; i < nomes.length; i++) {
            if (nomes[i].equalsIgnoreCase(nomeBusca)) {
                encontrado = true;
                break;
            }
        }

        if (encontrado) {
            System.out.println("Achei");
        } else {
            System.out.println("Não achei");
        }

        scanner.close();
    }
}
