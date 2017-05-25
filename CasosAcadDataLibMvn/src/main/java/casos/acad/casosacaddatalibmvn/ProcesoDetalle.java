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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author delsas
 */
@Entity
@Table(name = "proceso_detalle", catalog = "CasosAcad", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ProcesoDetalle.findAll", query = "SELECT p FROM ProcesoDetalle p")
    , @NamedQuery(name = "ProcesoDetalle.findByIdProcesoDetalle", query = "SELECT p FROM ProcesoDetalle p WHERE p.idProcesoDetalle = :idProcesoDetalle"),
    @NamedQuery(name = "ProcesoDetalle.findByIdProceso", query = "SELECT DISTINCT( m.idPaso.idPaso )  FROM ProcesoDetalle m WHERE m.idProceso.idProceso = :id")
})
public class ProcesoDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_proceso_detalle")
    private Integer idProcesoDetalle;
    @JoinColumn(name = "id_proceso", referencedColumnName = "id_proceso")
    @ManyToOne(optional = false)
    private Proceso idProceso;
    @JoinColumn(name = "id_paso", referencedColumnName = "id_paso")
    @ManyToOne(optional = false)
    private PasoRequisito idPaso;
    @OneToMany(mappedBy = "idPadre")
    private Collection<ProcesoDetalle> procesoDetalleCollection;
    @JoinColumn(name = "id_padre", referencedColumnName = "id_proceso")
    @ManyToOne
    private ProcesoDetalle idPadre;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idProceso")
    private Collection<Caso> casoCollection;

    public ProcesoDetalle() {
    }

    public ProcesoDetalle(Integer idProcesoDetalle) {
        this.idProcesoDetalle = idProcesoDetalle;
    }

    public Integer getIdProcesoDetalle() {
        return idProcesoDetalle;
    }

    public void setIdProcesoDetalle(Integer idProcesoDetalle) {
        this.idProcesoDetalle = idProcesoDetalle;
    }

    public Proceso getIdProceso() {
        return idProceso;
    }

    public void setIdProceso(Proceso idProceso) {
        this.idProceso = idProceso;
    }

    public PasoRequisito getIdPaso() {
        return idPaso;
    }

    public void setIdPaso(PasoRequisito idPaso) {
        this.idPaso = idPaso;
    }

    @XmlTransient
    public Collection<ProcesoDetalle> getProcesoDetalleCollection() {
        return procesoDetalleCollection;
    }

    public void setProcesoDetalleCollection(Collection<ProcesoDetalle> procesoDetalleCollection) {
        this.procesoDetalleCollection = procesoDetalleCollection;
    }

    public ProcesoDetalle getIdPadre() {
        return idPadre;
    }

    public void setIdPadre(ProcesoDetalle idPadre) {
        this.idPadre = idPadre;
    }

    @XmlTransient
    public Collection<Caso> getCasoCollection() {
        return casoCollection;
    }

    public void setCasoCollection(Collection<Caso> casoCollection) {
        this.casoCollection = casoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idProcesoDetalle != null ? idProcesoDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ProcesoDetalle)) {
            return false;
        }
        ProcesoDetalle other = (ProcesoDetalle) object;
        if ((this.idProcesoDetalle == null && other.idProcesoDetalle != null) || (this.idProcesoDetalle != null && !this.idProcesoDetalle.equals(other.idProcesoDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "casos.acad.casosacaddatalibmvn.ProcesoDetalle[ idProcesoDetalle=" + idProcesoDetalle + " ]";
    }
    
}
