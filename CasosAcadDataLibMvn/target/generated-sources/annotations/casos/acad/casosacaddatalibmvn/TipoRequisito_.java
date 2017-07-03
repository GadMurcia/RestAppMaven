package casos.acad.casosacaddatalibmvn;

import casos.acad.casosacaddatalibmvn.Requisito;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-02T12:55:53")
@StaticMetamodel(TipoRequisito.class)
public class TipoRequisito_ { 

    public static volatile SingularAttribute<TipoRequisito, String> descripcion;
    public static volatile CollectionAttribute<TipoRequisito, Requisito> requisitoCollection;
    public static volatile SingularAttribute<TipoRequisito, Integer> idTipoRequisito;
    public static volatile SingularAttribute<TipoRequisito, String> nombre;
    public static volatile SingularAttribute<TipoRequisito, Boolean> activo;

}