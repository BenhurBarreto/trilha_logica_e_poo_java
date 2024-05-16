package exercicios;

import java.util.Scanner;

public class valoresImpares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] vetor = new int[10];
        int contadorImpares = 0;

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor para a posição " + (i + 1) + ": ");
            vetor[i] = scanner.nextInt();
        }

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] % 2 != 0) {
                contadorImpares++;
            }
        }

        System.out.println("Quantidade de valores ímpares no vetor: " + contadorImpares);
        scanner.close();
    }
}
