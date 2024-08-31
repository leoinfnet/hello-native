package controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import service.HelloService;

import java.util.List;

@Path("/hello")
public class HelloController {
    @Inject
    HelloService helloService;
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<String> hello() {

        return List.of("Teste", "Teste", helloService.getName());
    }

}
