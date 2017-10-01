package br.com.ifce.poc.service;

@TrezeDigitos
public class IsbnGerador implements GeradorDeNumero {

    @Override
    public String gerarNumero() {
        return "ISBN: " + Math.random();
    }
}
