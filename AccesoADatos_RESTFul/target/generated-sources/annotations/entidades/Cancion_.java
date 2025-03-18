package entidades;

import javax.annotation.processing.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="org.eclipse.persistence.internal.jpa.modelgen.CanonicalModelProcessor", date="2025-03-17T20:13:30", comments="EclipseLink-2.7.12.v20230209-rNA")
@StaticMetamodel(Cancion.class)
public class Cancion_ { 

    public static volatile SingularAttribute<Cancion, String> artista;
    public static volatile SingularAttribute<Cancion, Float> duracion;
    public static volatile SingularAttribute<Cancion, Long> id;
    public static volatile SingularAttribute<Cancion, String> nombre;
    public static volatile SingularAttribute<Cancion, String> compositor;

}