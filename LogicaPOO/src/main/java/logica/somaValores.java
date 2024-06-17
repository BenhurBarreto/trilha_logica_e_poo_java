package logica;

public class somaValores {
    public static void main(String[] args) {
        double resultado = 0;
        int soma = 0;
        for (double x = 1; x <= 100; x++) {
            resultado += ((1 / 2) + (1 / 3)) / ((x / 4) + (1 / x));
            System.out.print("x -> " + String.valueOf(x) + " = ");
            System.out.println(resultado);
            if (resultado % 1 == 0) {
                soma += resultado;
            }
        }
        System.out.println("A soma dos valores inteiros da expressão para x de 1 a 100 é: " + soma);
    }
}
