package exercicios;

import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        boolean condicao = true;
        Scanner scanner = new Scanner(System.in);
        String num_1, num_2, operador;
        double resultado = 0;

        while (condicao) {
            System.out.println("Calculadora Básica: forneça as informações conforme solicitado.");
            System.out.print("Número 1: ");
            num_1 = scanner.next();
            if (isNumero(num_1)) {
                System.out.print("Operador: ");
                operador = scanner.next();
                if (isOperador(operador)) {
                    System.out.print("Número 2: ");
                    num_2 = scanner.next();
                    if (isNumero(num_2)) {
                        System.out.println("O resultado é: " + String.valueOf(realizaCalculo(num_1, num_2, operador)));
                    } else {
                        condicao = false;
                    }
                } else {
                    condicao = false;
                }
            } else {
                condicao = false;
            }
        }
    }

    public static boolean isOperador(String operador) {
        switch (operador) {
            case "+", "-", "*", "/" -> {
                return true;
            }
            default -> throw new IllegalArgumentException("Operador inválido.");
        }
    }

    public static boolean isNumero(String entrada) {
        try {
            Integer.parseInt(entrada);
            return true;
        } catch (NumberFormatException e1) {
            try {
                Double.parseDouble(entrada);
                return true;
            } catch (NumberFormatException e2) {
                System.out.println("Você digitou algo diferente de um inteiro ou flutuante. Programa ENCERRADO.");
                return false;
            }
        }
    }

    public static double realizaCalculo(String num_1, String num_2, String operador) {
        double numero1 = Double.parseDouble(num_1);
        double numero2 = Double.parseDouble(num_2);

        switch (operador) {
            case "+" -> {
                return numero1 + numero2;
            }
            case "-" -> {
                return numero1 - numero2;
            }
            case "*" -> {
                return numero1 * numero2;
            }
            case "/" -> {
                if (numero2 != 0) {
                    return numero1 / numero2;
                } else {
                    throw new IllegalArgumentException("Divisão por zero não é permitida.");
                }
            }
            default -> throw new IllegalArgumentException("Operador inválido.");
        }
    }
}
