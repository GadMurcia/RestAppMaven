/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package service;

import casos.acad.casosacaddatalibmvn.Paso;
import casos.acad.casosacaddatalibmvn.PasoRequisito;
import casos.acad.casosacaddatalibmvn.Proceso;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author delsas
 */
public class ProcesoDetalleFiltrado implements Serializable{
    List<Paso> paso= new ArrayList<>();
    Proceso proceso;

    public Proceso getProceso() {
        return proceso;
    }

    public ProcesoDetalleFiltrado(Proceso proceso, List<Paso> paso) {
        this.proceso = proceso;
        this.paso=paso;
    }

    public List<Paso> getPaso() {
        return paso;
    }

    public void setPaso(List<Paso> paso) {
        this.paso = paso;
    }

    public void setProceso(Proceso proceso) {
        this.proceso = proceso;
    }
    
    public void addPaso(Paso paso) {
        this.paso.add(paso);
    }
    
}
