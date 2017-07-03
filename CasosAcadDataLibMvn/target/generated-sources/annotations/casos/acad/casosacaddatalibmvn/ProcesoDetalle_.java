package casos.acad.casosacaddatalibmvn;

import casos.acad.casosacaddatalibmvn.Caso;
import casos.acad.casosacaddatalibmvn.PasoRequisito;
import casos.acad.casosacaddatalibmvn.Proceso;
import casos.acad.casosacaddatalibmvn.ProcesoDetalle;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-02T12:55:53")
@StaticMetamodel(ProcesoDetalle.class)
public class ProcesoDetalle_ { 

    public static volatile CollectionAttribute<ProcesoDetalle, Caso> casoCollection;
    public static volatile SingularAttribute<ProcesoDetalle, Integer> idProcesoDetalle;
    public static volatile SingularAttribute<ProcesoDetalle, PasoRequisito> idPaso;
    public static volatile SingularAttribute<ProcesoDetalle, Proceso> idProceso;
    public static volatile SingularAttribute<ProcesoDetalle, ProcesoDetalle> idPadre;
    public static volatile CollectionAttribute<ProcesoDetalle, ProcesoDetalle> procesoDetalleCollection;

}