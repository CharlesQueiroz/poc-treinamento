package br.com.ifce.poc.model;

import java.time.LocalDateTime;
import java.util.Objects;

import static java.util.Objects.*;

public class Livro {

    private String titulo;
    private Double preco;
    private String numero;
    private LocalDateTime dataCriacao;

    public Livro(String titulo, Double preco) {
        this.titulo = titulo;
        this.preco = preco;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro that = (Livro) o;

        return Objects.equals(this.titulo, that.titulo);
    }

    @Override
    public int hashCode() {
        return hash(titulo);
    }

    @Override
    public String toString() {
        return titulo;
    }

    public void setDataCriacao(LocalDateTime dataCriacao) {
        this.dataCriacao = dataCriacao;
    }

    public LocalDateTime getDataCriacao() {
        return dataCriacao;
    }
}
