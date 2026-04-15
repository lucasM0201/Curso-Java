package com.heranca.models;

public class PessoaJuridica extends Pessoa {
    // atributos
    public String razaoSocial;
    public String nomeFantasia;
    public String cnpj;
    public String website;

    // construtor
    public PessoaJuridica() {
    }

    // método
    public String recepcionar(String nome) {
        return "Prazer, " + nome + ". Somos a empresa " + this.nomeFantasia + ".";
    }
}
