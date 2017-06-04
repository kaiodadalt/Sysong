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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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
@Table(name = "ongs")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Ongs.findAll", query = "SELECT o FROM Ongs o")
    , @NamedQuery(name = "Ongs.findById", query = "SELECT o FROM Ongs o WHERE o.id = :id")
    , @NamedQuery(name = "Ongs.findByNome", query = "SELECT o FROM Ongs o WHERE o.nome = :nome")})
public class Ongs implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nome")
    private String nome;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDong")
    private Collection<Projetos> projetosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDong")
    private Collection<Blog> blogCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDong")
    private Collection<Parametros> parametrosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDong")
    private Collection<Paginas> paginasCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDong")
    private Collection<Doacao> doacaoCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDong")
    private Collection<Imagens> imagensCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDong")
    private Collection<Depoimentos> depoimentosCollection;
    @JoinColumn(name = "ID_usuario", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Usuarios iDusuario;
    @JoinColumn(name = "ID_mapa", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Mapa iDmapa;

    public Ongs() {
    }

    public Ongs(Integer id) {
        this.id = id;
    }

    public Ongs(Integer id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @XmlTransient
    public Collection<Projetos> getProjetosCollection() {
        return projetosCollection;
    }

    public void setProjetosCollection(Collection<Projetos> projetosCollection) {
        this.projetosCollection = projetosCollection;
    }

    @XmlTransient
    public Collection<Blog> getBlogCollection() {
        return blogCollection;
    }

    public void setBlogCollection(Collection<Blog> blogCollection) {
        this.blogCollection = blogCollection;
    }

    @XmlTransient
    public Collection<Parametros> getParametrosCollection() {
        return parametrosCollection;
    }

    public void setParametrosCollection(Collection<Parametros> parametrosCollection) {
        this.parametrosCollection = parametrosCollection;
    }

    @XmlTransient
    public Collection<Paginas> getPaginasCollection() {
        return paginasCollection;
    }

    public void setPaginasCollection(Collection<Paginas> paginasCollection) {
        this.paginasCollection = paginasCollection;
    }

    @XmlTransient
    public Collection<Doacao> getDoacaoCollection() {
        return doacaoCollection;
    }

    public void setDoacaoCollection(Collection<Doacao> doacaoCollection) {
        this.doacaoCollection = doacaoCollection;
    }

    @XmlTransient
    public Collection<Imagens> getImagensCollection() {
        return imagensCollection;
    }

    public void setImagensCollection(Collection<Imagens> imagensCollection) {
        this.imagensCollection = imagensCollection;
    }

    @XmlTransient
    public Collection<Depoimentos> getDepoimentosCollection() {
        return depoimentosCollection;
    }

    public void setDepoimentosCollection(Collection<Depoimentos> depoimentosCollection) {
        this.depoimentosCollection = depoimentosCollection;
    }

    public Usuarios getIDusuario() {
        return iDusuario;
    }

    public void setIDusuario(Usuarios iDusuario) {
        this.iDusuario = iDusuario;
    }

    public Mapa getIDmapa() {
        return iDmapa;
    }

    public void setIDmapa(Mapa iDmapa) {
        this.iDmapa = iDmapa;
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
        if (!(object instanceof Ongs)) {
            return false;
        }
        Ongs other = (Ongs) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.Ongs[ id=" + id + " ]";
    }
    
}
