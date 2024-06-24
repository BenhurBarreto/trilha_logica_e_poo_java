package poo.AgendaTelefonica;

public class AgendaTelefonica {
    static public void adicionarContato(String nome, long numero) {
        ListaDeContatos lista = new ListaDeContatos();
        lista.adicionarContato(nome, numero);
    }

    static public void removerContato(String nome) {
        ListaDeContatos lista = new ListaDeContatos();
        lista.removerContato(nome);
    }

    static public Contato buscarContato(String nome) {
        ListaDeContatos lista = new ListaDeContatos();
        return lista.getContato(nome);
    }

    static public void atualizarContato(String nome, String novoNome, long novoTelefone) {
        ListaDeContatos lista = new ListaDeContatos();
        if(lista.atualizarContato(nome, novoNome, novoTelefone)) {
            System.out.println("Contato atualizado!");
        } else {
            System.out.println("Erro ao atualizar o contato");
        }
    }

    static public void listarContatos() {
        ListaDeContatos lista = new ListaDeContatos();
        lista.listarContatos();
    }
}
