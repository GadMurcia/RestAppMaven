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
@Table(name = "requisito", catalog = "CasosAcad", schema = "")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Requisito.findAll", query = "SELECT r FROM Requisito r")
    , @NamedQuery(name = "Requisito.findByIdRequisito", query = "SELECT r FROM Requisito r WHERE r.idRequisito = :idRequisito")
    , @NamedQuery(name = "Requisito.findByNombre", query = "SELECT r FROM Requisito r WHERE r.nombre = :nombre")
    , @NamedQuery(name = "Requisito.findByDescripcion", query = "SELECT r FROM Requisito r WHERE r.descripcion = :descripcion")})
public class Requisito implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_requisito")
    private Integer idRequisito;
    @Size(max = 45)
    @Column(name = "nombre")
    private String nombre;
    @Size(max = 90)
    @Column(name = "descripcion")
    private String descripcion;
    @JoinColumn(name = "id_tipo_requisito", referencedColumnName = "id_tipo_requisito")
    @ManyToOne(optional = false)
    private TipoRequisito idTipoRequisito;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idRequisito")
    private Collection<PasoRequisito> pasoRequisitoCollection;

    public Requisito() {
    }

    public Requisito(Integer idRequisito) {
        this.idRequisito = idRequisito;
    }

    public Integer getIdRequisito() {
        return idRequisito;
    }

    public void setIdRequisito(Integer idRequisito) {
        this.idRequisito = idRequisito;
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

    public TipoRequisito getIdTipoRequisito() {
        return idTipoRequisito;
    }

    public void setIdTipoRequisito(TipoRequisito idTipoRequisito) {
        this.idTipoRequisito = idTipoRequisito;
    }

    @XmlTransient
    public Collection<PasoRequisito> getPasoRequisitoCollection() {
        return pasoRequisitoCollection;
    }

    public void setPasoRequisitoCollection(Collection<PasoRequisito> pasoRequisitoCollection) {
        this.pasoRequisitoCollection = pasoRequisitoCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idRequisito != null ? idRequisito.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Requisito)) {
            return false;
        }
        Requisito other = (Requisito) object;
        if ((this.idRequisito == null && other.idRequisito != null) || (this.idRequisito != null && !this.idRequisito.equals(other.idRequisito))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "casos.acad.casosacaddatalibmvn.Requisito[ idRequisito=" + idRequisito + " ]";
    }
    
}
