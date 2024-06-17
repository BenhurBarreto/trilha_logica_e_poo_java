package poo.comprasAtacadao;

import java.util.*;

public class CaixaDoAtacado {
    private Map<Integer, Produto> catalogo;

    public CaixaDoAtacado() {
        catalogo = new HashMap<>();
        catalogo.put(1, new Produto(1, "Café 1kg", 53.00));
        catalogo.put(2, new Produto(2, "Sabão em pó", 36.00));
        catalogo.put(3, new Produto(3, "Caixa de Leite", 82.00));
        catalogo.put(4, new Produto(4, "Refrigerante", 8.50));
    }

    public double computarCompra(String entrada) {
        String[] linhas = entrada.split("\n");
        String metodoPagamento = linhas[0];

        Compra compra = new Compra();

        for (int i = 1; i < linhas.length; i++) {
            String[] partes = linhas[i].split(",");
            int produtoId = Integer.parseInt(partes[0]);
            int quantidade = Integer.parseInt(partes[1]);
            Produto produto = catalogo.get(produtoId);
            if (produto != null) {
                compra.adicionarItem(produto, quantidade);
            }
        }

        double valorTotal = 0;
        for (Map.Entry<Produto, Integer> entradaCompra : compra.getItens().entrySet()) {
            Produto produto = entradaCompra.getKey();
            int quantidade = entradaCompra.getValue();
            double valorProduto = produto.getPreco() * quantidade;
            System.out.println("Produto : " + produto.getNome());
            valorProduto = Desconto.calcularDescontoPorQuantidade(valorProduto, quantidade);
            valorTotal += valorProduto;
        }

        valorTotal = Pagamento.dinheiroOuCartaoCredito(valorTotal, metodoPagamento);

        return valorTotal;
    }
}
