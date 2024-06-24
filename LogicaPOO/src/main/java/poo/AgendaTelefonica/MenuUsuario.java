package poo.AgendaTelefonica;

import java.util.Scanner;

public class MenuUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ListaDeContatos agendaTelefonica = new ListaDeContatos();
        int selecao = 0;
        String nome, novoNome;
        long numero, novoNumero;
        boolean continua = true;

        while (continua) {
            System.out.println("""
                \n
                1 - Adicionar um novo contato.
                2 - Remover um contato existente.
                3 - Buscar um contato pelo nome.
                4 - Atualizar informações de um contato.
                5 - Listar todos os contatos na agenda.
                6 - Sair do programa.""");

            System.out.print("Digite a sua opção: ");
            selecao = scanner.nextInt();

            switch (selecao) {
                case 1:
                    System.out.print("\nDigite o nome: ");
                    nome = scanner.next();
                    System.out.print("Digite o número: ");
                    numero = scanner.nextLong();
                    agendaTelefonica.adicionarContato(nome, numero);
                    break;

                case 2:
                    System.out.print("\nDigite o nome do contato que você deseja remover: ");
                    nome = scanner.next();
                    agendaTelefonica.removerContato(nome);
                    break;

                case 3:
                    System.out.print("\nDigite o nome do contato que deseja buscar: ");
                    nome = scanner.next();
                    Contato contato = agendaTelefonica.getContato(nome);
                    if (contato != null) {
                        System.out.println("Contato encontrado: " + contato);
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("\nDigite o nome do contato que deseja atualizar: ");
                    nome = scanner.next();
                    System.out.print("Digite o novo nome: ");
                    novoNome = scanner.next();
                    System.out.print("Digite o novo número: ");
                    novoNumero = scanner.nextLong();
                    boolean atualizado = agendaTelefonica.atualizarContato(nome, novoNome, novoNumero);
                    if (atualizado) {
                        System.out.println("Contato atualizado com sucesso.");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }
                    break;

                case 5:
                    agendaTelefonica.listarContatos();
                    break;

                case 6:
                    continua = false;
                    break;

                default:
                    System.out.println("\nSeleção inválida. Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}
