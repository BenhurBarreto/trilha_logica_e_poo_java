package poo.comprasAtacadao;

public class Desconto {
    public static double calcularDescontoPorQuantidade(double valorTotal, int quantidade) {
        if (quantidade > 25) {
            System.out.println("Foi aplicado desconto neste item: de " + valorTotal + " para " + valorTotal * 0.75);
            return valorTotal * 0.75;
        } else if (quantidade > 15) {
            System.out.println("Foi aplicado desconto neste item: de " + valorTotal + " para " + valorTotal * 0.8);
            return valorTotal * 0.8;
        } else if (quantidade > 5) {
            System.out.println("Foi aplicado desconto neste item: de " + valorTotal + " para " + valorTotal * 0.9);
            return valorTotal * 0.9;
        } else {
            System.out.println("Não recebeu desconto por quantidade");
            return valorTotal;
        }
    }
}
