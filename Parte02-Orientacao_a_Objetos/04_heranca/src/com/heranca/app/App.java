package com.heranca.app;

import java.util.Scanner;

import com.heranca.models.PessoaFisica;
import com.heranca.models.PessoaJuridica;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        PessoaFisica usuario = new PessoaFisica();
        PessoaJuridica empresa = new PessoaJuridica();

        // dados da empresa
        empresa.razaoSocial = "Alex SA";
        empresa.nomeFantasia = "Kids Graça Eventos Infantis";
        empresa.cnpj = "51.438.999/0001-96";
        empresa.email = "kidsgraca@contato.com.br";
        empresa.telefone = "(61) 98765-4321";
        empresa.endereco = "Campo da Esperança";
        empresa.website = "kidsgraca.com.br";

        // dados do usuário
        System.out.println("DADOS DO USUÁRIO:");
        System.out.println("Informe o nome do usuário:");
        usuario.nome = sc.nextLine();
        System.out.println("Informe o CPF do usuário:");
        usuario.cpf = sc.nextLine();
        System.out.println("Informe o e-mail do usuário:");
        usuario.email = sc.nextLine();
        System.out.println("Informe o telefone do usuário:");
        usuario.telefone = sc.nextLine();
        System.out.println("Informe o endereço do usuário:");
        usuario.endereco = sc.nextLine();
        System.out.println("Informe a idade do usuário:");
        usuario.idade = sc.nextInt();

        // saída de dados
        System.out.println(usuario.apresentar());
        System.out.println(empresa.recepcionar(usuario.nome));

        sc.close();
    }
}
