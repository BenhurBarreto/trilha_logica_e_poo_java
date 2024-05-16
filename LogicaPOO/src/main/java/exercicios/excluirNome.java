package exercicios;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class excluirNome {
    public static void main(String[] args) {
        String[] nomes = {"ben", "gui", "gu", "maroni", "gu", "tine", "lucas", "belo", "lucas", "barrey", "paola", "gi", "paola", "albino", "elena", "mana", "cleber", "duda", "giba", "pri"};
        Set<String> nomesUnicos = new HashSet<>(Arrays.asList(nomes));
        String[] nomesSemRepeticao = nomesUnicos.toArray(new String[0]);
        
        System.out.println("Nomes restantes após a exclusão dos repetidos:");
        for (String nome : nomesSemRepeticao) {
            System.out.println(nome);
        }
    }
}
