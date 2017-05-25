package casos.acad.casosacaddatalibmvn;

import casos.acad.casosacaddatalibmvn.Paso;
import casos.acad.casosacaddatalibmvn.ProcesoDetalle;
import casos.acad.casosacaddatalibmvn.Requisito;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-18T15:26:41")
@StaticMetamodel(PasoRequisito.class)
public class PasoRequisito_ { 

    public static volatile SingularAttribute<PasoRequisito, Integer> idPasoRequisito;
    public static volatile SingularAttribute<PasoRequisito, Paso> idPaso;
    public static volatile SingularAttribute<PasoRequisito, Requisito> idRequisito;
    public static volatile CollectionAttribute<PasoRequisito, ProcesoDetalle> procesoDetalleCollection;

}