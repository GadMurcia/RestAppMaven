package casos.acad.casosacaddatalibmvn;

import casos.acad.casosacaddatalibmvn.Caso;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-02T12:55:53")
@StaticMetamodel(Solicitud.class)
public class Solicitud_ { 

    public static volatile CollectionAttribute<Solicitud, Caso> casoCollection;
    public static volatile SingularAttribute<Solicitud, String> nombreSolicitante;
    public static volatile SingularAttribute<Solicitud, String> nombreSolicitud;
    public static volatile SingularAttribute<Solicitud, Integer> idSolicitud;

}