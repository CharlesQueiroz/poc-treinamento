package br.com.ifce.poc.api;

import br.com.ifce.poc.model.Usuario;

import javax.ws.rs.*;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

import static javax.ws.rs.core.Response.ok;

@Path("usuarios")
@Produces("application/json")
public class UsuarioResource {
    private static List<Usuario> tabelaUsuarios;

    static {
        tabelaUsuarios = new ArrayList<>();
        tabelaUsuarios.add(new Usuario(1,"Charles"));
        tabelaUsuarios.add(new Usuario(2, "Daniel"));
    }

    @GET
    public Response findAll(){
        return ok(tabelaUsuarios).build();
    }

    @GET
    @Path("{id}/endereco/{id}")
    public Response findById(@PathParam("id") Integer id) {
        Usuario paraRetornar = null;
        for(Usuario usuario : tabelaUsuarios) {
            if(usuario.getId().equals(id)) {
                paraRetornar = usuario;
                break;
            }
        }
        return ok(paraRetornar).build();
    }
}
