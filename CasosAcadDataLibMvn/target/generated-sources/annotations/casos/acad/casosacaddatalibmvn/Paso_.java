package casos.acad.casosacaddatalibmvn;

import casos.acad.casosacaddatalibmvn.PasoRequisito;
import casos.acad.casosacaddatalibmvn.TipoPaso;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-07-02T12:55:53")
@StaticMetamodel(Paso.class)
public class Paso_ { 

    public static volatile SingularAttribute<Paso, String> descripcion;
    public static volatile SingularAttribute<Paso, TipoPaso> idTipoPaso;
    public static volatile CollectionAttribute<Paso, PasoRequisito> pasoRequisitoCollection;
    public static volatile SingularAttribute<Paso, Integer> idPaso;
    public static volatile SingularAttribute<Paso, String> nombre;

}