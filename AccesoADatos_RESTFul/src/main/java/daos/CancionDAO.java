
package daos;

import conexion.Conexion;
import entidades.Cancion;
import java.util.logging.Logger;
import java.util.List;
import java.util.logging.Level;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.TypedQuery;

/**
 *
 * @author victo
 */
public class CancionDAO implements ICancionDAO{

    private EntityManager entityManager;
    
    private static final Logger logger = Logger.getLogger(CancionDAO.class.getName());

    public CancionDAO() {
        this.entityManager = Conexion.getInstance().crearConexion();
    }
    
    
    @Override
    public void agregar(Cancion cancion) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            entityManager.persist(cancion);
            transaction.commit();
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            logger.log(Level.SEVERE, e.getMessage());
        }
    }

    @Override
    public void actualizar(Cancion cancion) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            Cancion actualizado = entityManager.merge(cancion);
            transaction.commit();
            entityManager.refresh(actualizado);
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            logger.log(Level.SEVERE, e.getMessage());
        }
    }

    @Override
    public void eliminar(Long id) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            Cancion cancion = entityManager.find(Cancion.class, id);
            if (cancion != null) {
                entityManager.remove(cancion);
                transaction.commit();
            }
        } catch (Exception e) {
            if (transaction.isActive()) {
                transaction.rollback();
            }
            logger.log(Level.SEVERE, e.getMessage());
        }
    }

    @Override
    public List<Cancion> obtenerTodasLasCanciones() {
        try {
            TypedQuery<Cancion> query = entityManager.createQuery("SELECT c FROM Cancion c", Cancion.class);
            return query.getResultList();
        } catch (Exception e) {
            logger.log(Level.SEVERE,e.getMessage());
        }
        return null;
    }

    @Override
    public Cancion obtenerCancionPorID(Long id) {
        try {
            return entityManager.find(Cancion.class, id);
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage());
        }
        return null;
    }

    @Override
    public List<Cancion> obtenerCancionPorNombre(String nombre) {
        try {
            TypedQuery<Cancion> query = entityManager.createQuery(
                    "SELECT c FROM Cancion c WHERE c.nombre = :nombre",
                    Cancion.class
            );
            query.setParameter("nombre", nombre);
            return query.getResultList();
        } catch (Exception e) {
            logger.log(Level.SEVERE, e.getMessage());
        }
        return null;
    }
    
}
