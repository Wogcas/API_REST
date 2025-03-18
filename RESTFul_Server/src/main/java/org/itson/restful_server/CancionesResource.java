/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package org.itson.restful_server;

import com.itson.restful_entidad.CancionDTO;
import daos.CancionDAO;
import daos.ICancionDAO;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 * REST Web Service
 *
 * @author castr
 */
@Path("canciones")
@RequestScoped
public class CancionesResource {

    ICancionDAO cancionDAO = new CancionDAO();

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CancionesResource
     */
    public CancionesResource() {
    }

//    @Path("/agregar")
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response agregarCancion(Cancion cancion) {
//        try {
//            cancionDAO.agregar(cancion);
//            return Response.status(200).entity(cancion).build();
//        } catch (Exception e) {
//            Response.status(Response.Status.UNAUTHORIZED);
//        }
//    }

//    /**
//     * Retrieves representation of an instance of org.itson.restful_server.CancionesResource
//     * @return an instance of java.lang.String
//     */
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public String getJson() {
//        //TODO return proper representation object
//        throw new UnsupportedOperationException();
//    }
//
//    /**
//     * PUT method for updating or creating an instance of CancionesResource
//     * @param content representation for the resource
//     */
//    @PUT
//    @Consumes(MediaType.APPLICATION_JSON)
//    public void putJson(String content) {
//    }
}
