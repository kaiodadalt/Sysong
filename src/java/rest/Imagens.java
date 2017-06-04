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
@Table(name = "imagens")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Imagens.findAll", query = "SELECT i FROM Imagens i")
    , @NamedQuery(name = "Imagens.findById", query = "SELECT i FROM Imagens i WHERE i.id = :id")
    , @NamedQuery(name = "Imagens.findByCaminhoImagem", query = "SELECT i FROM Imagens i WHERE i.caminhoImagem = :caminhoImagem")
    , @NamedQuery(name = "Imagens.findByTipo", query = "SELECT i FROM Imagens i WHERE i.tipo = :tipo")})
public class Imagens implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "CaminhoImagem")
    private String caminhoImagem;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Tipo")
    private String tipo;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDimagem")
    private Collection<Projetos> projetosCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDimagem")
    private Collection<ComentariosBlog> comentariosBlogCollection;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDimagem")
    private Collection<Blog> blogCollection;
    @OneToMany(mappedBy = "iDimagem")
    private Collection<BlogDescricao> blogDescricaoCollection;
    @JoinColumn(name = "ID_ong", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Ongs iDong;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDimagem")
    private Collection<Depoimentos> depoimentosCollection;

    public Imagens() {
    }

    public Imagens(Integer id) {
        this.id = id;
    }

    public Imagens(Integer id, String caminhoImagem, String tipo) {
        this.id = id;
        this.caminhoImagem = caminhoImagem;
        this.tipo = tipo;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @XmlTransient
    public Collection<Projetos> getProjetosCollection() {
        return projetosCollection;
    }

    public void setProjetosCollection(Collection<Projetos> projetosCollection) {
        this.projetosCollection = projetosCollection;
    }

    @XmlTransient
    public Collection<ComentariosBlog> getComentariosBlogCollection() {
        return comentariosBlogCollection;
    }

    public void setComentariosBlogCollection(Collection<ComentariosBlog> comentariosBlogCollection) {
        this.comentariosBlogCollection = comentariosBlogCollection;
    }

    @XmlTransient
    public Collection<Blog> getBlogCollection() {
        return blogCollection;
    }

    public void setBlogCollection(Collection<Blog> blogCollection) {
        this.blogCollection = blogCollection;
    }

    @XmlTransient
    public Collection<BlogDescricao> getBlogDescricaoCollection() {
        return blogDescricaoCollection;
    }

    public void setBlogDescricaoCollection(Collection<BlogDescricao> blogDescricaoCollection) {
        this.blogDescricaoCollection = blogDescricaoCollection;
    }

    public Ongs getIDong() {
        return iDong;
    }

    public void setIDong(Ongs iDong) {
        this.iDong = iDong;
    }

    @XmlTransient
    public Collection<Depoimentos> getDepoimentosCollection() {
        return depoimentosCollection;
    }

    public void setDepoimentosCollection(Collection<Depoimentos> depoimentosCollection) {
        this.depoimentosCollection = depoimentosCollection;
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
        if (!(object instanceof Imagens)) {
            return false;
        }
        Imagens other = (Imagens) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.Imagens[ id=" + id + " ]";
    }
    
}
