package exercicios;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Scanner;

public class NotaFinalDoAluno {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira as notas do aluno conforme o programa solicita.");
        int somatorio = 0, nota = 0;

        for (int index = 0; index < 3; index++) {
            System.out.print("Insira a Nota " + String.valueOf(index + 1) + ": ");
            nota = scanner.nextInt();
            somatorio = somatorio + nota;
        }

        double mediaFinal = (double) somatorio /3;
        DecimalFormat df = new DecimalFormat("#.##");
        if (mediaFinal >= 7) {
            System.out.println("Aprovado. A nota do final do aluno foi de " + String.valueOf(df.format(mediaFinal)));
        } else if (mediaFinal < 7 || mediaFinal >= 5) {
            System.out.println("Recuperação. A nota do final do aluno foi de " + String.valueOf(df.format(mediaFinal)));
        } else {
            System.out.println("Reprovado. A nota do final do aluno foi de " + String.valueOf(df.format(mediaFinal)));
        }
    }
}
