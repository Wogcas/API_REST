/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.itson.restful_client;

import com.itson.restful_entidad.CancionDTO;
import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.GenericType;
import jakarta.ws.rs.core.Response;
import java.util.List;

/**
 *
 * @author castr
 */
public class RESTFul_Client {

    private static Client client = ClientBuilder.newClient();
    private static WebTarget base = client.target("http://localhost:8080/RESTFul_Server/resources/canciones");

    public static void main(String[] args) {

        Response get = base.request().get();
        if (get.getStatus() == 200) {
            List<CancionDTO> canciones = get.readEntity(new GenericType<List<CancionDTO>>() {
            });

            if (!canciones.isEmpty()) {
                for (CancionDTO cancion : canciones) {
                    System.out.println(cancion.getNombre());
                }
            } else {
                System.out.println("No se encontraron canciones");
            }
        } else {
            System.out.println("Error al obtener canciones: " + get.getStatus());
        }
    }

//        base = base.path("agregar");
//
//        Response post = base.request()
//                .post(Entity.entity(
//                        new CancionDTO("Mo bamba", "Check wes", 2.3F, "Check wes"),
//                        MediaType.APPLICATION_JSON));
//
//        if (post.getStatus() == 201) {
//            CancionDTO resp = post.readEntity(CancionDTO.class);
//            System.out.println(resp.toString());
//            System.out.println("Canción agregada: " + resp.getNombre());
//        } else {
//            System.out.println("Error al agregar canción: " + post.getStatus());
//        }
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
