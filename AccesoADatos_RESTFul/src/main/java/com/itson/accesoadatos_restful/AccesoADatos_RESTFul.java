/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.itson.accesoadatos_restful;

import daos.CancionDAO;
import daos.ICancionDAO;
import entidades.Cancion;
import java.util.List;

/**
 *
 * @author victo
 */
public class AccesoADatos_RESTFul {

    public static void main(String[] args) throws Exception {
//        Cancion cancion = new Cancion();
//        cancion.setNombre("My Kind Of Woman");
//        cancion.setArtista("Mac Demarco");
//        cancion.setDuracion(2.3F);
//        cancion.setCompositor("Mac Demarco");

        ICancionDAO cancionDAO = new CancionDAO();
//        cancionDAO.agregar(cancion);
//        System.out.println("Sigma sigma boy");

        List<Cancion> canciones = cancionDAO.obtenerTodasLasCanciones();
        for (Cancion c : canciones) {
            System.out.println(c.getNombre());
        }
    }
}
