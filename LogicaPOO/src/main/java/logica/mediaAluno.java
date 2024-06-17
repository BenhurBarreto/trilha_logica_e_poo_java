package logica;

import java.util.Scanner;

public class mediaAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota_1, nota_2, mediaFinal;
        String continuar;

        while (true) {
            System.out.println("Cálculo da Média Final");
            System.out.print("Entre com a Nota 1: ");
            nota_1 = scanner.nextDouble();
            System.out.print("Entre com a Nota 2: ");
            nota_2 = scanner.nextDouble();
            mediaFinal = (nota_1 + nota_2)/2;
            System.out.println("A média do aluno é de " + String.valueOf(mediaFinal) + ".");
            if (mediaFinal >= 7.0) {
                System.out.println("Aluno APROVADO");
            } else {
                System.out.println("Aluno REPROVADO");
            }
            System.out.print("Deseja realizar um novo cálculo? Digite S ou qualquer outro caracter para finalizar: ");
            continuar = scanner.next();
            if (!continuar.equalsIgnoreCase("S")) {
                System.out.println("Programa finalizado.");
                scanner.close();
                break;
            }
            System.out.print("\n");
            scanner.nextLine();
        }
    }
}
