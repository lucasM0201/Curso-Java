package com.crud.javalanches.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List; 

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Categoria implements Serializable { // 2. Boa prática implementar Serializable
    private static final long serialVersionUID = 1L;

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO) 
    private Long codigoCategoria; // 4. Alterado para Long (objeto) para evitar o erro 400/Null

    @Column(unique = true, nullable = false)
    private String novaCategoria;

    // Relacionamento Bi-direcional com Produto
    @OneToMany(mappedBy = "categoria")
    private List<Produto> produtos = new ArrayList<>();

    // Construtor Padrão (Obrigatório para o JPA)
    public Categoria() {
    }

    // Construtor com Argumentos (Opcional, mas útil)
    public Categoria(Long codigoCategoria, String novaCategoria) {
        this.codigoCategoria = codigoCategoria;
        this.novaCategoria = novaCategoria;
    }

    // Getters e Setters
    public Long getCodigoCategoria() {
        return this.codigoCategoria;
    }

    public void setCodigoCategoria(Long codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getNovaCategoria() {
        return this.novaCategoria;
    }

    public void setNovaCategoria(String novaCategoria) {
        this.novaCategoria = novaCategoria;
    }

    public List<Produto> getProdutos() {
        return this.produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
}