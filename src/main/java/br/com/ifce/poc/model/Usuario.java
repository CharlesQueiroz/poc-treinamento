package br.com.ifce.poc.model;


import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Usuario {

    @JsonProperty("id")
    private Integer id;

    @JsonProperty("nomeUsuario")
    private String nome;

    @JsonCreator
    public Usuario(@JsonProperty("id") Integer id,
                   @JsonProperty("nome") String nome) {
        this.id = id;
        this.nome = nome;
    }


    public Integer getId() {
        return id;
    }
}
