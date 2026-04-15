package com.catraca.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        String nome;
        double peso;
        double altura;
        int opcao;

        // laço de repetição
        do {
            System.out.println("Deseja registrar nova entrada?");
            System.out.println("1 - Registrar nova entrada");
            System.out.println("2 - Sair do programa");
            opcao = sc.nextInt();

            if (opcao == 1) {
                sc.nextLine();
                System.out.println("Informe o nome:");
                nome = sc.nextLine();
                System.out.println("Informe o peso em kg:");
                peso = sc.nextDouble();
                System.out.println("Informe a altura em metros:");
                altura = sc.nextDouble();

                if (peso < 120 && altura >= 1.25) {
                    System.out.println("Entrada de " + nome + " autorizada.");
                }
                else {
                    System.out.println("Entrada de " + nome + " não autorizada.");
                }
            }
            else if (opcao == 2) {
                System.out.println("Obrigado pela preferência!");
            }
            else {
                System.out.println("Opção inválida.");
            }
        } while(opcao != 2);

        sc.close();
    }
}
