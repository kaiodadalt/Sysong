/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "mapa")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Mapa.findAll", query = "SELECT m FROM Mapa m")
    , @NamedQuery(name = "Mapa.findById", query = "SELECT m FROM Mapa m WHERE m.id = :id")
    , @NamedQuery(name = "Mapa.findByTipo", query = "SELECT m FROM Mapa m WHERE m.tipo = :tipo")
    , @NamedQuery(name = "Mapa.findByDescricao", query = "SELECT m FROM Mapa m WHERE m.descricao = :descricao")})
public class Mapa implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Tipo")
    private String tipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "Descricao")
    private String descricao;
    @OneToMany(mappedBy = "iDmapa")
    private Collection<Projetos> projetosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDmapa")
    private Collection<Ongs> ongsCollection;

    public Mapa() {
    }

    public Mapa(Integer id) {
        this.id = id;
    }

    public Mapa(Integer id, String tipo, String descricao) {
        this.id = id;
        this.tipo = tipo;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @XmlTransient
    public Collection<Projetos> getProjetosCollection() {
        return projetosCollection;
    }

    public void setProjetosCollection(Collection<Projetos> projetosCollection) {
        this.projetosCollection = projetosCollection;
    }

    @XmlTransient
    public Collection<Ongs> getOngsCollection() {
        return ongsCollection;
    }

    public void setOngsCollection(Collection<Ongs> ongsCollection) {
        this.ongsCollection = ongsCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Mapa)) {
            return false;
        }
        Mapa other = (Mapa) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.Mapa[ id=" + id + " ]";
    }
    
}
