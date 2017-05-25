package casos.acad.casosacaddatalibmvn;

import casos.acad.casosacaddatalibmvn.CasoDetalle;
import casos.acad.casosacaddatalibmvn.CasoDetalleRequisitoAtestado;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-18T15:26:41")
@StaticMetamodel(CasoDetalleRequisito.class)
public class CasoDetalleRequisito_ { 

    public static volatile SingularAttribute<CasoDetalleRequisito, String> descripcion;
    public static volatile SingularAttribute<CasoDetalleRequisito, CasoDetalle> idCasoDetalle;
    public static volatile SingularAttribute<CasoDetalleRequisito, Integer> idCasoDetalleRequisito;
    public static volatile CollectionAttribute<CasoDetalleRequisito, CasoDetalleRequisitoAtestado> casoDetalleRequisitoAtestadoCollection;

}