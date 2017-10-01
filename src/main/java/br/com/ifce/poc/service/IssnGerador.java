package br.com.ifce.poc.service;

import javax.enterprise.inject.Default;

@Default
public class IssnGerador implements GeradorDeNumero {

    @Override
    public String gerarNumero() {
        return "ISSN: " + Math.random();
    }
}
