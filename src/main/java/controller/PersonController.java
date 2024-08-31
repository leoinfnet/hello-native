package controller;

import jakarta.transaction.Transactional;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import model.Person;

@Path("/person")
public class PersonController {
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getAll() {
        return Response.ok(Person.listAll()).build();
    }
    @POST@Transactional
    @Produces(MediaType.APPLICATION_JSON)
    public Response create(Person person) {
        person.persist();
        return Response.ok(person).build();
    }
}
