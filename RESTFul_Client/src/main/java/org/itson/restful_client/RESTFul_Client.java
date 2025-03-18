/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.itson.restful_client;

import com.itson.restful_entidad.CancionDTO;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.Entity;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author castr
 */
public class RESTFul_Client {

    private static Client client = ClientBuilder.newClient();
    private static WebTarget base = client.target("http://localhost:8080/RESTFul_Server/resources/canciones");

    public static void main(String[] args) {
        base = base.path("agregar");

        Response post = base.request()
                .post(Entity.entity(
                        new CancionDTO("Mo bamba", "Check wes", 2.3F, "Check wes"),
                        MediaType.APPLICATION_JSON));
        if (post.getStatus() == 201) {
            CancionDTO resp = post.readEntity(CancionDTO.class);
            resp.toString();
            System.out.println(resp.getNombre());
        } else {
            post.getStatus();
            System.out.println(post.getStatus());
        }
    }
}

//        
//        Client cliente = ClientBuilder.newClient();
//        String BASE_URL = "http://localhost:8080/RESTFul_Server/resources/canciones";
//
//        Response response;
//
////        // Agregar nueva canción
////        System.out.println("•••••• AGREGAR NUEVA CANCIÓN ••••••");
////        CancionDTO nuevaCancion = new CancionDTO("Mo bamba", "Check wes", 2.3F, "Check wes");
////        response = cliente.target(BASE_URL)
////                .request()
////                .post(Entity.json(nuevaCancion));
////        if (response.getStatus() == 201) {
////            System.out.println("Canción agregada con éxito");
////        } else {
////            System.out.println("Error al agregar canción: " + response.getStatus());
////        }
////        
//}
//
////    static String getId(WebTarget base, int id) {
////        base = base.path("1");
////        Response get = base.request().get();
////        if (get.getStatus() == 200) {
////            CancionDTO resp = get.readEntity(CancionDTO.class);
////            return resp.toString();
////        } else {
////            return "error " + get.getStatus();
////        }
////    }
//}
