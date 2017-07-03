package casos.acad.casosacaddatalibmvn;

import casos.acad.casosacaddatalibmvn.ProcesoDetalle;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-02T12:55:53")
@StaticMetamodel(Proceso.class)
public class Proceso_ { 

    public static volatile SingularAttribute<Proceso, String> descripcion;
    public static volatile SingularAttribute<Proceso, Integer> idProceso;
    public static volatile SingularAttribute<Proceso, String> nombre;
    public static volatile CollectionAttribute<Proceso, ProcesoDetalle> procesoDetalleCollection;

}