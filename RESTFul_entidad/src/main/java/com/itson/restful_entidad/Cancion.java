
package com.itson.restful_entidad;

/**
 *
 * @author victo
 */
public class Cancion {
     
    private Long id;
    private String nombre;
    private String artista;
    private Float duracion;
    private String compositor;

    public Cancion() {
    }

    public Cancion(Long id, String nombre, String artista, Float duracion, String compositor) {
        this.id = id;
        this.nombre = nombre;
        this.artista = artista;
        this.duracion = duracion;
        this.compositor = compositor;
    }    
    
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Float getDuracion() {
        return duracion;
    }

    public void setDuracion(Float duracion) {
        this.duracion = duracion;
    }

    public String getCompositor() {
        return compositor;
    }

    public void setCompositor(String compositor) {
        this.compositor = compositor;
    }
}
