package poo.comprasAtacadao;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o método de pagamento seguido da sua lista de compras (item,qntd):");
        StringBuilder entradaBuilder = new StringBuilder();
        String linha;
        while (!(linha = scanner.nextLine()).isEmpty()) {
            entradaBuilder.append(linha).append("\n");
        }

        String entrada = entradaBuilder.toString().trim();

        CaixaDoAtacado caixa = new CaixaDoAtacado();
        double total = caixa.computarCompra(entrada);
        System.out.printf("Valor total da compra: R$ %.2f%n", total);
    }
}
