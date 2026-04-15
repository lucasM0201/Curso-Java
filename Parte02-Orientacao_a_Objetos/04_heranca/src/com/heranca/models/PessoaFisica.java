package com.heranca.models;

public class PessoaFisica extends Pessoa {
    // atributos
    public String nome;
    public String cpf;
    public int idade;

    // construtor
    public PessoaFisica() {
    }

    // método
    public String apresentar() {
        return "Olá, meu nome é " + this.nome + ". Prazer";
    }
}
