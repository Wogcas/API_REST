package conexion;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 *
 * @author victo
 */
public class Conexion {

    private static EntityManager entityManager;

    /**
     * Crea una conexión con el gestor de persistencia.
     *
     * @return Un objeto EntityManager para interactuar con la base de datos.
     */
    static {
        EntityManagerFactory emFactory = Persistence.createEntityManagerFactory("MusicaPU");
        // Solicitamos una entity manager (acceso a la BD)
        entityManager = emFactory.createEntityManager();
    }

    // Método para obtener el EntityManager (opcional pero recomendado)
    public static EntityManager getEntityManager() {
        return entityManager;
    }
}
