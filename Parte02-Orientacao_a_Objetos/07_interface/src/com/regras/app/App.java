package com.regras.app;

import java.util.Scanner;

import com.regras.models.Pessoa;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Pessoa homem = new Pessoa(null, null);
        Pessoa mulher = new Pessoa(null, null);

        System.out.println("Informe o nome do homem:");
        homem.setNome(sc.nextLine());
        System.out.println("Informe o e-mail do homem:");
        homem.setEmail(sc.nextLine());
        System.out.println("Informe o nome da mulher:");
        mulher.setNome(sc.nextLine());
        System.out.println("Informe o e-mail da mulher:");
        mulher.setEmail(sc.nextLine());

        System.out.println(homem.apresentar());
        System.out.println(mulher.apresentar());
        System.out.println(homem.cumprimentar(mulher.getNome()));
        System.out.println(mulher.cumprimentar(homem.getNome()));
        homem.exibirDados();
        mulher.exibirDados();

        sc.close();
    }
}
