package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        while (true) {
            try {
                System.out.print("De 1 a 10, digite o número que você deseja ver a sua tabuada: ");
                numero = scanner.nextInt();
                if (numero >= 1 && numero < 11) {
                    System.out.println("TABUADA DO " + numero + ":");
                    for (int i = 1; i <= 10; i++) {
                        System.out.println(numero + " x " + i + " = " + String.valueOf(numero * i));
                    }
                    break;
                } else {
                    System.out.println("Inválido!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Por favor, digite um número inteiro.");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
