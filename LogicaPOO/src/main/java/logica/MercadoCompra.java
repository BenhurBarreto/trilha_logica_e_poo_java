package logica;

import java.util.Objects;
import java.util.Scanner;

public class MercadoCompra {
    public static void main(String[] args) {
        boolean condicao = true;
        while(condicao) {
            Scanner entrada = new Scanner(System.in);
            System.out.print("""
                    Qual item você deseja comprar?
                    1 - Cerveja
                    2 - Refrigerante
                    3 - Água
                    Insira o número do item e pressione Enter para realizar a compra:\s""");
            int item = entrada.nextInt();
            if (item == 1) {
                int idade;
                System.out.print("""
                        Para comprar cerveja, você precisa informar a sua idade:\s""");
                idade = entrada.nextInt();
                if (idade >= 18) {
                    System.out.println("Compra efetuada com SUCESSO!");
                    condicao = false;
                } else {
                    System.out.println("Compra NEGADA. Você não possui idade suficiente para comprar este item");
                    condicao = false;
                }

            } else if (Objects.equals(item, 2) || Objects.equals(item, 3)) {
                System.out.println("Compra efetuada com SUCESSO!");
                condicao = false;

            } else {
                System.out.println("Parece que você digitou algo diferente. Tente novamente.\n");
            }
        }
    }
}
