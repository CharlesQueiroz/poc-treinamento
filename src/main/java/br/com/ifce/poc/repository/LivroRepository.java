package br.com.ifce.poc.repository;

import br.com.ifce.poc.model.Livro;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.Map;

public class LivroRepository {

    private Map<Integer, Livro> banco;

    private static Integer geradorId = 1;

    @PostConstruct
    private void init() {
        banco = new HashMap<>();
    }

    public Livro salvar(Livro livro) {
        banco.put(geradorId++, livro);
        return livro;
    }
}
