package com.crud.javalanches.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Categoria {
     private static final long serialVersionUID = 1L;

    // Atributos
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long codigoCategoria;
    @Column(unique = true, nullable = false)
    private String nomeCategoria;


    public Categoria(long codigoCategoria, String nomeCategoria) {
        this.codigoCategoria = codigoCategoria;
        this.nomeCategoria = nomeCategoria;
    }

    public long getCodigoCategoria() {
        return this.codigoCategoria;
    }

    public void setCodigoCategoria(long codigoCategoria) {
        this.codigoCategoria = codigoCategoria;
    }

    public String getNomeCategoria() {
        return this.nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }
    




}
