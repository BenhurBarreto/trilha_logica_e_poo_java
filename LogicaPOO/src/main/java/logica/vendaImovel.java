package logica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class vendaImovel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String nome;
        int valor = 0;
        System.out.print("Digite o nome do vendedor: ");
        nome = scanner.next();
        System.out.print("Digite o valor do imóvel: ");
        valor = scanner.nextInt();
        DecimalFormat df = new DecimalFormat("#.##");
        if (valor >= 50000) {
            System.out.println("O vendedor " + nome + " deverá receber " + String.valueOf(df.format((double) valor*0.2)) + " pela venda do imóvel no valor de " + String.valueOf(valor));
        } else if (valor >= 30000) {
            System.out.println("O vendedor " + nome + " deverá receber " + String.valueOf(df.format((double) valor*0.15)) + " pela venda do imóvel no valor de " + String.valueOf(valor));
        } else {
            System.out.println("O vendedor " + nome + " deverá receber " + String.valueOf(df.format((double) valor*0.1)) + " pela venda do imóvel no valor de " + String.valueOf(valor));
        }
    }
}
