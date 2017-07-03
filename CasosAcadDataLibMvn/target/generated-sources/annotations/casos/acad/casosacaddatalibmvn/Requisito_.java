package casos.acad.casosacaddatalibmvn;

import casos.acad.casosacaddatalibmvn.PasoRequisito;
import casos.acad.casosacaddatalibmvn.TipoRequisito;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-02T12:55:53")
@StaticMetamodel(Requisito.class)
public class Requisito_ { 

    public static volatile SingularAttribute<Requisito, String> descripcion;
    public static volatile CollectionAttribute<Requisito, PasoRequisito> pasoRequisitoCollection;
    public static volatile SingularAttribute<Requisito, Integer> idRequisito;
    public static volatile SingularAttribute<Requisito, String> nombre;
    public static volatile SingularAttribute<Requisito, TipoRequisito> idTipoRequisito;

}