/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package casos.acad.casosacaddatalibmvn;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author delsas
 */
@Entity
@Table(name = "proceso", catalog = "CasosAcad", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Proceso.findAll", query = "SELECT p FROM Proceso p")
    , @NamedQuery(name = "Proceso.findByIdProceso", query = "SELECT p FROM Proceso p WHERE p.idProceso = :idProceso")
    , @NamedQuery(name = "Proceso.findByNombre", query = "SELECT p FROM Proceso p WHERE p.nombre = :nombre")
    , @NamedQuery(name = "Proceso.findByDescripcion", query = "SELECT p FROM Proceso p WHERE p.descripcion = :descripcion")})
public class Proceso implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_proceso")
    private Integer idProceso;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 90)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProceso")
    private Collection<ProcesoDetalle> procesoDetalleCollection;

    public Proceso() {
    }

    public Proceso(Integer idProceso) {
        this.idProceso = idProceso;
    }

    public Integer getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(Integer idProceso) {
        this.idProceso = idProceso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<ProcesoDetalle> getProcesoDetalleCollection() {
        return procesoDetalleCollection;
    }

    public void setProcesoDetalleCollection(Collection<ProcesoDetalle> procesoDetalleCollection) {
        this.procesoDetalleCollection = procesoDetalleCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProceso != null ? idProceso.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Proceso)) {
            return false;
        }
        Proceso other = (Proceso) object;
        if ((this.idProceso == null && other.idProceso != null) || (this.idProceso != null && !this.idProceso.equals(other.idProceso))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "casos.acad.casosacaddatalibmvn.Proceso[ idProceso=" + idProceso + " ]";
    }
    
}
