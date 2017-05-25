/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import casos.acad.acceso.PasoRequisitoFacadeLocal;
import casos.acad.casosacaddatalibmvn.PasoRequisito;
import casos.acad.casosacaddatalibmvn.Requisito;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author delsas
 */
@RequestScoped
@Path("/pasorequisito")
public class PasoRequisitoFacadeREST{

    @EJB
    private PasoRequisitoFacadeLocal prfl;

    public PasoRequisitoFacadeREST() {
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public void create(PasoRequisito entity) {
        prfl.create(entity);
    }

    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, PasoRequisito entity) {
        prfl.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        prfl.remove(prfl.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public PasoRequisito find(@PathParam("id") Integer id) {
        return prfl.find(id);
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    public List<PasoRequisito> findAll() {
        return prfl.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<PasoRequisito> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return prfl.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(prfl.count());
    }

    protected EntityManager getEntityManager() {
        return this.prfl.getEntityManager();
    }
    
    @GET
    @Path("requisito/{id}")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Requisito> findIdpaso(@PathParam("id") Integer id) {
        return prfl.findAllIdPaso(id);
    }
    
}
