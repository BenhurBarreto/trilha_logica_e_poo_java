package logica;

import java.util.Scanner;

public class bloqueioUsuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String usuario_correto = "aluno", senha_correta = "segredo";
        String usuario, senha;

        int tentativas = 3;

        System.out.println("Sistema de Login do Aluno. Você possui 3 tentativas caso erre a senha.");
        while (tentativas > 0) {
            System.out.print("Digite o usuário: ");
            usuario = scanner.next();
            System.out.print("Digite a senha: ");
            senha = scanner.next();

            if (usuario.equals(usuario_correto) && senha.equals(senha_correta)) {
                System.out.println("Bem-vindo(a).");
                break;
            } else {
                tentativas--;
                if (tentativas > 0) {
                    System.out.println("Login incorreto. Tentativas restantes: " + tentativas);
                } else {
                    System.out.println("Você excedeu o número de tentativas permitidas. Sua conta está bloqueada.");
                }
            }
        }

    }
}
