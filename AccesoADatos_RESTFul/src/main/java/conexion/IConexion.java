
package conexion;

import javax.persistence.EntityManager;

/**
 *
 * @author victo
 */
public interface IConexion {
    
    public EntityManager crearConexion();
}
