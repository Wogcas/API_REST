
package daos;

import entidades.Cancion;
import java.util.List;

/**
 *
 * @author victo
 */
public interface ICancionDAO {
    
    public void agregar(Cancion cancion);
    
    public void actualizar(Cancion cancion);
    
    public void eliminar(Long id);
    
    public List<Cancion> obtenerTodasLasCanciones();
    
    public Cancion obtenerCancionPorID(Long id);
    
    public List<Cancion> obtenerCancionPorNombre(String nombre);
}
