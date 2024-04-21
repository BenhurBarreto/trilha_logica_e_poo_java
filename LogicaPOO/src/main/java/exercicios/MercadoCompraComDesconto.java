package exercicios;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MercadoCompraComDesconto {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("""
                Bem-vindo ao Mercado!
                Por favor, insira os produtos comprados:""");

        List<Produto> produtos = new ArrayList<>();

        while (true) {
            System.out.print("Nome do produto (ou 'fim' para encerrar): ");
            String nomeProduto = scanner.nextLine();

            if (nomeProduto.equalsIgnoreCase("fim")) {
                break;
            }

            System.out.print("Preço do produto (com vírgula caso coloque centavos): R$ ");
            double precoProduto = scanner.nextDouble();

            System.out.print("Quantidade: ");
            int quantidade = scanner.nextInt();

            scanner.nextLine();

            Produto produto = new Produto(nomeProduto, precoProduto, quantidade);
            produtos.add(produto);
        }

        double total = calcularTotal(produtos);
        double totalSemDesconto = calculaTotalSemDesconto(produtos);
        double diferenca = totalSemDesconto - total;

        DecimalFormat df = new DecimalFormat("#.##");

        System.out.println("\nQuantidade total de itens: " + calculaQuantidadeTotal(produtos));
        System.out.println("Valor final sem desconto: R$ " + df.format(totalSemDesconto));
        System.out.println("Valor final com desconto: R$ " + df.format(total));
        System.out.println("Diferença (desconto aplicado): R$ " + df.format(diferenca));

        scanner.close();
    }

    public static double calcularTotal(List<Produto> produtos) {
        int quantidadeTotal = calculaQuantidadeTotal(produtos);
        double subtotal = 0;

        for (Produto produto : produtos) {
            subtotal += produto.getPreco() * produto.getQuantidade();
        }

        double desconto = calculaDesconto(quantidadeTotal, subtotal);
        return subtotal - desconto;
    }

    public static double calculaTotalSemDesconto(List<Produto> produtos) {
        double subtotal = 0;
        for (Produto produto : produtos) {
            subtotal += produto.getPreco() * produto.getQuantidade();
        }
        return subtotal;
    }

    public static int calculaQuantidadeTotal(List<Produto> produtos) {
        int quantidadeTotal = 0;
        for (Produto produto : produtos) {
            quantidadeTotal += produto.getQuantidade();
        }
        return quantidadeTotal;
    }

    public static double calculaDesconto(int quantidadeTotal, double subtotal) {
        if (quantidadeTotal <= 10) {
            return 0;
        } else if (quantidadeTotal <= 20) {
            return subtotal * 0.1;
        } else if (quantidadeTotal <= 50) {
            return subtotal * 0.2;
        } else {
            return subtotal * 0.25;
        }
    }
}

class Produto {
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public int getQuantidade() {
        return quantidade;
    }
}