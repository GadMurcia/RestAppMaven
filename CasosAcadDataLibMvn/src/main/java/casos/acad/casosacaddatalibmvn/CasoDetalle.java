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
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author delsas
 */
@Entity
@Table(name = "caso_detalle", catalog = "CasosAcad", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CasoDetalle.findAll", query = "SELECT c FROM CasoDetalle c")
    , @NamedQuery(name = "CasoDetalle.findByIdCasoDetalle", query = "SELECT c FROM CasoDetalle c WHERE c.idCasoDetalle = :idCasoDetalle")
    , @NamedQuery(name = "CasoDetalle.findByDescripcion", query = "SELECT c FROM CasoDetalle c WHERE c.descripcion = :descripcion")})
public class CasoDetalle implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_caso_detalle")
    private Integer idCasoDetalle;
    @Size(max = 90)
    @Column(name = "descripcion")
    private String descripcion;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCasoDetalle")
    private Collection<CasoDetalleRequisito> casoDetalleRequisitoCollection;
    @JoinColumn(name = "id_caso", referencedColumnName = "id_caso")
    @ManyToOne(optional = false)
    private Caso idCaso;

    public CasoDetalle() {
    }

    public CasoDetalle(Integer idCasoDetalle) {
        this.idCasoDetalle = idCasoDetalle;
    }

    public Integer getIdCasoDetalle() {
        return idCasoDetalle;
    }

    public void setIdCasoDetalle(Integer idCasoDetalle) {
        this.idCasoDetalle = idCasoDetalle;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @XmlTransient
    public Collection<CasoDetalleRequisito> getCasoDetalleRequisitoCollection() {
        return casoDetalleRequisitoCollection;
    }

    public void setCasoDetalleRequisitoCollection(Collection<CasoDetalleRequisito> casoDetalleRequisitoCollection) {
        this.casoDetalleRequisitoCollection = casoDetalleRequisitoCollection;
    }

    public Caso getIdCaso() {
        return idCaso;
    }

    public void setIdCaso(Caso idCaso) {
        this.idCaso = idCaso;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCasoDetalle != null ? idCasoDetalle.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CasoDetalle)) {
            return false;
        }
        CasoDetalle other = (CasoDetalle) object;
        if ((this.idCasoDetalle == null && other.idCasoDetalle != null) || (this.idCasoDetalle != null && !this.idCasoDetalle.equals(other.idCasoDetalle))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "casos.acad.casosacaddatalibmvn.CasoDetalle[ idCasoDetalle=" + idCasoDetalle + " ]";
    }
    
}
