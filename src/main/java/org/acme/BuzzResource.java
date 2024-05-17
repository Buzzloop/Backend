package org.acme;

import jakarta.inject.Inject;
import jakarta.transaction.Transactional;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

import java.time.LocalDateTime;
import java.util.List;

import org.acme.model.Buzz;
import org.acme.service.BuzzService;

@Path("/api/buzz")
public class BuzzResource {

    @Inject
    BuzzService buzzService;

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Transactional
    public Response saveBuzz(Buzz buzz) {
        buzz.createdAt = LocalDateTime.now();
        buzz.persist();
        return Response.ok().build();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Buzz> getAllBuzzes() {
        return Buzz.listAll();
    }

    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Transactional
    public Response deleteBuzz(@PathParam("id") Long id) {
        Buzz buzz = Buzz.findById(id);
        if (buzz == null) {
            return Response.status(Response.Status.NOT_FOUND).build();
        }
        buzz.delete();
        return Response.ok().build();

    }
}