package casos.acad.casosacaddatalibmvn;

import casos.acad.casosacaddatalibmvn.CasoDetalle;
import casos.acad.casosacaddatalibmvn.ProcesoDetalle;
import casos.acad.casosacaddatalibmvn.Solicitud;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-02T12:55:53")
@StaticMetamodel(Caso.class)
public class Caso_ { 

    public static volatile CollectionAttribute<Caso, CasoDetalle> casoDetalleCollection;
    public static volatile SingularAttribute<Caso, Integer> idCaso;
    public static volatile SingularAttribute<Caso, String> observaciones;
    public static volatile SingularAttribute<Caso, Solicitud> idSolicitud;
    public static volatile SingularAttribute<Caso, ProcesoDetalle> idProceso;

}