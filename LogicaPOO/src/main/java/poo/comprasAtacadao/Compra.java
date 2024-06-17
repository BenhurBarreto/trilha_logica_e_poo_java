package poo.comprasAtacadao;

import java.util.HashMap;
import java.util.Map;

public class Compra {
    private Map<Produto, Integer> itens;

    public Compra() {
        this.itens = new HashMap<>();
    }

    public void adicionarItem(Produto produto, int quantidade) {
        itens.put(produto, quantidade);
    }

    public Map<Produto, Integer> getItens() {
        return itens;
    }
}
