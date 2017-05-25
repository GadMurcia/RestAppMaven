/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casos.acad.acceso;

import casos.acad.casosacaddatalibmvn.Paso;
import casos.acad.casosacaddatalibmvn.PasoRequisito;
import casos.acad.casosacaddatalibmvn.ProcesoDetalle;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author omar
 */
@Stateless
public class ProcesoDetalleFacade extends AbstractFacade<ProcesoDetalle> implements ProcesoDetalleFacadeLocal {

    @PersistenceContext(unitName = "casos.acad_CasosAcadAppMvn-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    public ProcesoDetalleFacade() {
        super(ProcesoDetalle.class);
    }

    @Override
    public List<Paso> findByIdProceso(Object id) {
        List<Paso>  salida = null;
        try {
            if (em != null) {
                Query cq = em.createNamedQuery("ProcesoDetalle.findByIdProceso");
                cq.setParameter("id", id);
                salida=cq.getResultList();
                if (salida != null) {
                    return salida;
                }
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (salida == null) {
                salida = new ArrayList();
            }
        }
        return salida;
    }
    
}
