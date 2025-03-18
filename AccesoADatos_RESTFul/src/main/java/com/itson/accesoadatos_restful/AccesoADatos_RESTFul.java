/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.itson.accesoadatos_restful;

import conexion.Conexion;
import daos.CancionDAO;
import daos.ICancionDAO;
import entidades.Cancion;

/**
 *
 * @author victo
 */
public class AccesoADatos_RESTFul {

    public static void main(String[] args) {
        Cancion cancion = new Cancion();
        cancion.setNombre("My Kind Of Woman");
        cancion.setArtista("Mac Demarco");
        cancion.setDuracion(2.3F);
        cancion.setCompositor("Mac Demarco");

        ICancionDAO cancionDAO = new CancionDAO();
        cancionDAO.agregar(cancion);
        System.out.println("Sigma sigma boy");
    }
}
