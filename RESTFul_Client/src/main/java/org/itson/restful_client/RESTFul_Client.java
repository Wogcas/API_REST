/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package org.itson.restful_client;

import jakarta.ws.rs.client.Client;
import jakarta.ws.rs.client.ClientBuilder;
import jakarta.ws.rs.client.WebTarget;
import jakarta.ws.rs.core.Response;

/**
 *
 * @author castr
 */
public class RESTFul_Client {

    public static void main(String[] args) {
        Client client = ClientBuilder.newClient();
        WebTarget base = client.
                target("http://localhost:8080/RESTFul_Server/resources");
        base = base.path("canciones");
        System.out.println("\nGet por ID: \n" + getId(base, 3));

    }

    static String getId(WebTarget base, int id) {
        base = base.path("1");
        Response get = base.request().get();
        if (get.getStatus() == 200) {
            Cancion resp = get.readEntity(Cancion.class);
            return resp.toString();
        } else {
            return "error " + get.getStatus();
        }
    }

   
}
