package br.com.ifce.poc.service;

import br.com.ifce.poc.interceptor.LogInterceptor;
import br.com.ifce.poc.model.Livro;
import br.com.ifce.poc.repository.LivroRepository;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.interceptor.Interceptors;
import java.time.LocalDateTime;

import static java.time.LocalDateTime.now;

public class LivroService {

    @Inject
    @TrezeDigitos
    private GeradorDeNumero gerador;

    @Inject
    private LivroRepository repository;

    private LocalDateTime dataCriacao;

    @PostConstruct
    private void init() {
        dataCriacao = now();
    }

    @Interceptors(value = LogInterceptor.class)
    public Livro salvar(String nome, double preco) {
        final Livro livro = new Livro(nome, preco);
        livro.setNumero(gerador.gerarNumero());
        livro.setDataCriacao(dataCriacao);
        return repository.salvar(livro);
    }
}
