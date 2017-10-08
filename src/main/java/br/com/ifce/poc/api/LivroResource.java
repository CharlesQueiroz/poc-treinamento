package br.com.ifce.poc.api;

import br.com.ifce.poc.model.Livro;
import br.com.ifce.poc.service.LivroService;

import javax.enterprise.context.RequestScoped;
import javax.enterprise.event.Observes;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;
import java.util.logging.Logger;

import static java.lang.String.format;
import static javax.ws.rs.core.Response.ok;

@RequestScoped
@Path("/livros")
public class LivroResource {

    @Inject
    private Logger logger;

    @Inject
    private LivroService service;

    @GET
    public Response salvar() {
        logger.info("Entrei no método salvar");
        Livro livroSalvo = service.salvar("Clean Code", 50.00);
        return ok(livroSalvo.getNumero()).build();
    }

    public void processaKKKK(@Observes String kkk) {
        logger.info(() -> format("Ria: %s", kkk.toLowerCase()));
    }
}
