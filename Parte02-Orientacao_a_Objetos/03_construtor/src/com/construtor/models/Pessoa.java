package com.construtor.models;

public class Pessoa {
    // atributos
    public String nome;
    public String email;
    public String telefone;
    public String cpf;
    public int idade;
    public double altura;

    public Pessoa() {
    }

    public Pessoa(String nome, String email, String telefone, String cpf, int idade, double altura) {
        this.nome = nome;
        this.email = email;
        this.telefone = telefone;
        this.cpf = cpf;
        this.idade = idade;
        this.altura = altura;
    }

}
