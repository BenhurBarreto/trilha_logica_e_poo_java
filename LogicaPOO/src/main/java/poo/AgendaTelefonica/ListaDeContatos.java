package poo.AgendaTelefonica;

import java.util.ArrayList;
import java.util.List;

public class ListaDeContatos {
    private List<Contato> lista;

    public ListaDeContatos() {
        lista = new ArrayList<>();
        lista.add(new Contato("benhur", 5198745632L));
        lista.add(new Contato("lucas", 5199887766L));
        lista.add(new Contato("matheus", 5188997744L));
        lista.add(new Contato("anderson", 5122334455L));
    }

    public Contato getContato(String nome) {
        for (Contato contato : lista) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                return contato;
            }
        }
        return null;
    }

    public void adicionarContato(String nome, long telefone) {
        lista.add(new Contato(nome, telefone));
    }

    public void removerContato(String nome) {
        lista.removeIf(contato -> contato.getNome().equalsIgnoreCase(nome));
    }

    public boolean atualizarContato(String nome, String novoNome, long novoNumero) {
        for (Contato contato : lista) {
            if (contato.getNome().equalsIgnoreCase(nome)) {
                contato.setNome(novoNome);
                contato.setNumero(novoNumero);
                return true;
            }
        }
        return false;
    }

    public void listarContatos() {
        for (Contato contato : lista) {
            System.out.println(contato);
        }
    }
}
