
package conexion;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author victo
 */
public class Conexion implements IConexion{

    private static EntityManagerFactory entityManagerFactory;
    private static Conexion instance;

    private Conexion() {
    }

    private static EntityManagerFactory getEntityManagerFactory(){
        if (entityManagerFactory == null) {
            try {
                entityManagerFactory = Persistence.createEntityManagerFactory("MusicaPU");
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
        return entityManagerFactory;
    }
    
    public static Conexion getInstance() {
        if (instance == null) {
            instance = new Conexion();
        }
        return instance;
    }

    @Override
    public EntityManager crearConexion(){
        return getEntityManagerFactory().createEntityManager();
    }

    public static void cerrarConexion() {
        if (entityManagerFactory != null && entityManagerFactory.isOpen()) {
            entityManagerFactory.close();
        }
    }
}
