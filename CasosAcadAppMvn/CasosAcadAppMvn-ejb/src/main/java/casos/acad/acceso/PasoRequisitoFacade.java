/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casos.acad.acceso;

import casos.acad.casosacaddatalibmvn.PasoRequisito;
import casos.acad.casosacaddatalibmvn.Requisito;
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
public class PasoRequisitoFacade extends AbstractFacade<PasoRequisito> implements PasoRequisitoFacadeLocal {

    @PersistenceContext(unitName = "casos.acad_CasosAcadAppMvn-ejb_ejb_1.0-SNAPSHOTPU")
    private EntityManager em;

    @Override
    public EntityManager getEntityManager() {
        return em;
    }

    public PasoRequisitoFacade() {
        super(PasoRequisito.class);
    }
    
    @Override
    public  List<Requisito> findAllIdPaso(Object id) {
        List<Requisito>  salida = null;
        try {
            if (em != null) {
                Query cq = em.createNamedQuery("PasoRequisito.findByIdPaso");
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
