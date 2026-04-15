package com.calculadora.app;

import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // instancia a classe Scanner
        Scanner sc = new Scanner(System.in);

        // declaração de variáveis
        double num1;
        double num2;
        double result = 0;
        String operador;

        // entrada de dados
        System.out.println("Informe o 1º número:");
        num1 = sc.nextDouble();
        System.out.println("Informe o 2º número:");
        num2 = sc.nextDouble();

        // limpeza de buffer
        sc.nextLine();

        // menu
        System.out.println("Informe a operação desejada:");
        System.out.println("1 - soma");
        System.out.println("2 - subtração");
        System.out.println("3 - multiplicação");
        System.out.println("4 - divisão");
        operador = sc.nextLine();

        // verifica a operação desejada
        switch (operador) {
            case "1":
                result = num1+num2;
                System.out.println("O valor da soma é " + result);
                break;
            case "2":
                result = num1-num2;
                System.out.println("O valor da subtração é " + result);
                break;
            case "3":
                result = num1*num2;
                System.out.println("O valor da multiplicação é " + result);
                break;
            case "4":
                result = num1/num2;
                System.out.println("O valor da divisão é " + result);
                break;
            default:
                System.out.println("Operação inválida.");
        }

        // fecha objeto Scanner
        sc.close();
    }
}
