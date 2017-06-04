/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "blog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Blog.findAll", query = "SELECT b FROM Blog b")
    , @NamedQuery(name = "Blog.findById", query = "SELECT b FROM Blog b WHERE b.id = :id")
    , @NamedQuery(name = "Blog.findByTitulo", query = "SELECT b FROM Blog b WHERE b.titulo = :titulo")
    , @NamedQuery(name = "Blog.findByDataPostagem", query = "SELECT b FROM Blog b WHERE b.dataPostagem = :dataPostagem")
    , @NamedQuery(name = "Blog.findByDataAlteracao", query = "SELECT b FROM Blog b WHERE b.dataAlteracao = :dataAlteracao")
    , @NamedQuery(name = "Blog.findByVisivel", query = "SELECT b FROM Blog b WHERE b.visivel = :visivel")})
public class Blog implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DataPostagem")
    @Temporal(TemporalType.DATE)
    private Date dataPostagem;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DataAlteracao")
    @Temporal(TemporalType.DATE)
    private Date dataAlteracao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "Visivel")
    private boolean visivel;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDblog")
    private Collection<ComentariosBlog> comentariosBlogCollection;
    @JoinColumn(name = "ID_categoria", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Categorias iDcategoria;
    @JoinColumn(name = "ID_imagem", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Imagens iDimagem;
    @JoinColumn(name = "ID_ong", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Ongs iDong;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDblog")
    private Collection<BlogDescricao> blogDescricaoCollection;

    public Blog() {
    }

    public Blog(Integer id) {
        this.id = id;
    }

    public Blog(Integer id, String titulo, Date dataPostagem, Date dataAlteracao, boolean visivel) {
        this.id = id;
        this.titulo = titulo;
        this.dataPostagem = dataPostagem;
        this.dataAlteracao = dataAlteracao;
        this.visivel = visivel;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Date getDataPostagem() {
        return dataPostagem;
    }

    public void setDataPostagem(Date dataPostagem) {
        this.dataPostagem = dataPostagem;
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        this.dataAlteracao = dataAlteracao;
    }

    public boolean getVisivel() {
        return visivel;
    }

    public void setVisivel(boolean visivel) {
        this.visivel = visivel;
    }

    @XmlTransient
    public Collection<ComentariosBlog> getComentariosBlogCollection() {
        return comentariosBlogCollection;
    }

    public void setComentariosBlogCollection(Collection<ComentariosBlog> comentariosBlogCollection) {
        this.comentariosBlogCollection = comentariosBlogCollection;
    }

    public Categorias getIDcategoria() {
        return iDcategoria;
    }

    public void setIDcategoria(Categorias iDcategoria) {
        this.iDcategoria = iDcategoria;
    }

    public Imagens getIDimagem() {
        return iDimagem;
    }

    public void setIDimagem(Imagens iDimagem) {
        this.iDimagem = iDimagem;
    }

    public Ongs getIDong() {
        return iDong;
    }

    public void setIDong(Ongs iDong) {
        this.iDong = iDong;
    }

    @XmlTransient
    public Collection<BlogDescricao> getBlogDescricaoCollection() {
        return blogDescricaoCollection;
    }

    public void setBlogDescricaoCollection(Collection<BlogDescricao> blogDescricaoCollection) {
        this.blogDescricaoCollection = blogDescricaoCollection;
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
        if (!(object instanceof Blog)) {
            return false;
        }
        Blog other = (Blog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.Blog[ id=" + id + " ]";
    }
    
}
