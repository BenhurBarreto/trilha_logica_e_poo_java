package exercicios;

import java.util.Scanner;

public class encerraPrograma {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean condicao = true;
        String numero;
        while (condicao) {
            System.out.print("Digite um número: ");
            numero = scanner.nextLine();
            try {
                Integer.parseInt(numero);
                if (Integer.parseInt(numero) == 10) {
                    condicao = false;
                    System.out.println("Você digitou 10 e saiu do programa.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Você não digitou um número.");
            }
        }
    }
}
