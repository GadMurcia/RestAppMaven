package casos.acad.casosacaddatalibmvn;

import casos.acad.casosacaddatalibmvn.Paso;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-05-18T15:26:41")
@StaticMetamodel(TipoPaso.class)
public class TipoPaso_ { 

    public static volatile SingularAttribute<TipoPaso, Integer> idTipoPaso;
    public static volatile SingularAttribute<TipoPaso, String> descripcion;
    public static volatile CollectionAttribute<TipoPaso, Paso> pasoCollection;
    public static volatile SingularAttribute<TipoPaso, String> nombre;
    public static volatile SingularAttribute<TipoPaso, Boolean> activo;

}