package com.regras.models;

import com.regras.repository.IPessoa;

public class Pessoa implements IPessoa {
    // atributos
    private String nome;
    private String email;

    // construtor
    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }

    // getters e setters
    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // métodos
    @Override
    public String apresentar() {
        return "Olá, meu nome é " + this.nome + ".";
    }

    @Override
    public void exibirDados() {
        System.out.println("Nome: " + this.nome);
        System.out.println("E-mail: " + this.email);
    }

    @Override
    public String cumprimentar(String nome) {
        return "Olá " + nome + ", prazer em te conhecer";
    }

}
