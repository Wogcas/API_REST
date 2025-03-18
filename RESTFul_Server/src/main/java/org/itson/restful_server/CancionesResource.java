/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/WebServices/GenericResource.java to edit this template
 */
package org.itson.restful_server;

import com.itson.restful_entidad.CancionDTO;
import daos.CancionDAO;
import daos.ICancionDAO;
import entidades.Cancion;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.UriInfo;
import jakarta.ws.rs.Consumes;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.Path;
import jakarta.enterprise.context.RequestScoped;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.POST;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;
import org.itson.restful_server.conversor.ConversorCancion;

/**
 * REST Web Service
 *
 * @author castr
 */
@Path("canciones")
@RequestScoped
public class CancionesResource {

    ICancionDAO cancionDAO;

    @Context
    private UriInfo context;

    /**
     * Creates a new instance of CancionesResource
     */
    public CancionesResource() throws Exception {
        this.cancionDAO = new CancionDAO();
    }

//    @GET
//    @Produces(MediaType.TEXT_PLAIN)
//    public String hola() {
//        return "¡Hola desde el servidor!";
//    }
    
    
//    @Path("/agregar")
//    @POST
//    @Produces(MediaType.APPLICATION_JSON)
//    @Consumes(MediaType.APPLICATION_JSON)
//    public Response agregarCancion(CancionDTO cancion) {
//        try {
//            System.out.println("DTO recibido: " + cancion);
//            Cancion cancionAgregada = ConversorCancion.DTOToEntity(cancion);
//            System.out.println("Entidad convertida: " + cancionAgregada);
//            cancionDAO.agregar(cancionAgregada);
//            System.out.println("Intentando guardar en base de datos");
//            return Response.status(201).entity(cancion).build();
//        } catch (Exception e) {
//            e.printStackTrace();
//            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
//        }
//    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getCanciones() {
        try {
            List<Cancion> canciones = cancionDAO.obtenerTodasLasCanciones();
            
            System.out.println("Canciones obtenidas: " + canciones.size());
//            List<CancionDTO> cancionesDTO = new ArrayList<>();
//            for (Cancion c : canciones) {
//                cancionesDTO.add(ConversorCancion.entityToDTO(c));
//            }
            return Response.status(200).entity(canciones.toArray()).build();
        } catch (Exception e) {
            e.printStackTrace();
            return Response.status(Response.Status.INTERNAL_SERVER_ERROR).entity(e.getMessage()).build();
        }

    }
}
