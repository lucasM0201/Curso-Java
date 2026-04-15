package com.encapsulamento.models;

final public class PessoaJuridica extends Pessoa {
    // atributos
    private String nomeFantasia;
    private String cnpj;

    // construtor
    public PessoaJuridica(String nomeFantasia, String cnpj, String email, String telefone) {
        super(email, telefone);
        this.nomeFantasia = nomeFantasia;
        this.cnpj = cnpj;
    }

    // getter e setter
    public String getNomeFantasia() {
        return this.nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getCnpj() {
        return this.cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
