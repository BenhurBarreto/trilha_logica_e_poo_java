package poo.comprasAtacadao;

public class Pagamento {
    public static double dinheiroOuCartaoCredito(double valorTotal, String metodoPagamento) {
        switch (metodoPagamento.toLowerCase()) {
            case "dinheiro":
                System.out.println("Pagamento em dinheiro: aplicado desconto de 5%. De " + valorTotal + " para " + valorTotal * 0.95);
                return valorTotal * 0.95;
            case "credito":
                System.out.println("Pagamento em cartão de crétido: aplicado taxa de 3%. De " + valorTotal + " para " + valorTotal * 1.03);
                return valorTotal * 1.03;
            case "debito":
            default:
                return valorTotal;
        }
    }
}
