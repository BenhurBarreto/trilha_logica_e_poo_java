package logica;

import java.util.InputMismatchException;
import java.util.Scanner;

public class divisao {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double numerador = 0, denumerador = 0;
        while (true) {
            try {
                System.out.print("Digite o dividendo: ");
                numerador = scanner.nextDouble();
                System.out.print("Digite o divisor: ");
                denumerador = scanner.nextDouble();
                if (denumerador == 0) {
                    System.out.println("Divisôes por 0 não possíveis. Digite um número válido.");
                } else {
                    System.out.println(numerador % denumerador);
                    break;
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida!");
                scanner.nextLine();
            }
        }
        scanner.close();
    }
}
