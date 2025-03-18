package org.itson.restful_server.conversor;

import entidades.Cancion;
import com.itson.restful_entidad.CancionDTO;



/**
 *
 * @author asielapodaca
 */
public class ConversorCancion {
    
    /**
     * Clase que convierte una clase Cancion del DAO a CancionDTO
     * @param cancion Clase del DAO
     * @return Acceso a datos de Cancion
     */
    public static CancionDTO entityToDTO(Cancion cancion) {
        CancionDTO DTO = new CancionDTO();
        DTO.setId(cancion.getId());
        DTO.setNombre(cancion.getNombre());
        DTO.setArtista(cancion.getArtista());
        DTO.setCompositor(cancion.getCompositor());
        DTO.setDuracion(cancion.getDuracion());
        
        return DTO;
    }
    
    /**
     * Clase que convierte una clase Cancion del CancionDTO a DAO
     * @param cancionDTO Clase de acceso a datos de Cancion
     * @return Cancion del DAO
     */
    public static Cancion DTOToEntity(CancionDTO cancionDTO) {
        Cancion entity = new Cancion();
        entity.setId(cancionDTO.getId());
        entity.setNombre(cancionDTO.getNombre());
        entity.setArtista(cancionDTO.getArtista());
        entity.setCompositor(cancionDTO.getCompositor());
        entity.setDuracion(cancionDTO.getDuracion());
        
        return entity;
    }
}
