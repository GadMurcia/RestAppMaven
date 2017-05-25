package casos.acad.casosacaddatalibmvn;

import casos.acad.casosacaddatalibmvn.Caso;
import casos.acad.casosacaddatalibmvn.CasoDetalleRequisito;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-18T15:26:41")
@StaticMetamodel(CasoDetalle.class)
public class CasoDetalle_ { 

    public static volatile SingularAttribute<CasoDetalle, Integer> idCasoDetalle;
    public static volatile SingularAttribute<CasoDetalle, String> descripcion;
    public static volatile CollectionAttribute<CasoDetalle, CasoDetalleRequisito> casoDetalleRequisitoCollection;
    public static volatile SingularAttribute<CasoDetalle, Caso> idCaso;

}