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
@Table(name = "paso_requisito", catalog = "CasosAcad", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "PasoRequisito.findAll", query = "SELECT p FROM PasoRequisito p")
    , @NamedQuery(name = "PasoRequisito.findByIdPasoRequisito", query = "SELECT p FROM PasoRequisito p WHERE p.idPasoRequisito = :idPasoRequisito"),
    @NamedQuery(name = "PasoRequisito.findByIdPaso", query = "SELECT p.idRequisito FROM PasoRequisito AS p WHERE p.idPaso.idPaso = :id")
})
public class PasoRequisito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_paso_requisito")
    private Integer idPasoRequisito;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idPaso")
    private Collection<ProcesoDetalle> procesoDetalleCollection;
    @JoinColumn(name = "id_paso", referencedColumnName = "id_paso")
    @ManyToOne(optional = false)
    private Paso idPaso;
    @JoinColumn(name = "id_requisito", referencedColumnName = "id_requisito")
    @ManyToOne(optional = false)
    private Requisito idRequisito;

    public PasoRequisito() {
    }

    public PasoRequisito(Integer idPasoRequisito) {
        this.idPasoRequisito = idPasoRequisito;
    }

    public Integer getIdPasoRequisito() {
        return idPasoRequisito;
    }

    public void setIdPasoRequisito(Integer idPasoRequisito) {
        this.idPasoRequisito = idPasoRequisito;
    }

    @XmlTransient
    public Collection<ProcesoDetalle> getProcesoDetalleCollection() {
        return procesoDetalleCollection;
    }

    public void setProcesoDetalleCollection(Collection<ProcesoDetalle> procesoDetalleCollection) {
        this.procesoDetalleCollection = procesoDetalleCollection;
    }

    public Paso getIdPaso() {
        return idPaso;
    }

    public void setIdPaso(Paso idPaso) {
        this.idPaso = idPaso;
    }

    public Requisito getIdRequisito() {
        return idRequisito;
    }

    public void setIdRequisito(Requisito idRequisito) {
        this.idRequisito = idRequisito;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idPasoRequisito != null ? idPasoRequisito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PasoRequisito)) {
            return false;
        }
        PasoRequisito other = (PasoRequisito) object;
        if ((this.idPasoRequisito == null && other.idPasoRequisito != null) || (this.idPasoRequisito != null && !this.idPasoRequisito.equals(other.idPasoRequisito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "casos.acad.casosacaddatalibmvn.PasoRequisito[ idPasoRequisito=" + idPasoRequisito + " ]";
    }
    
}
