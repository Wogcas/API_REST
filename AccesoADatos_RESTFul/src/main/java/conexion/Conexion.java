package conexion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author victo
 */
public class Conexion {

    private static final EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("MusicaPU");

    /**
     * Crea una conexión con el gestor de persistencia.
     *
     * @return Un objeto EntityManager para interactuar con la base de datos.
     */
    public static EntityManager createEntityManager() {
        return entityManagerFactory.createEntityManager();
    }

}
