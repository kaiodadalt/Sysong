/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "blogdescricao")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "BlogDescricao.findAll", query = "SELECT b FROM BlogDescricao b")
    , @NamedQuery(name = "BlogDescricao.findById", query = "SELECT b FROM BlogDescricao b WHERE b.id = :id")
    , @NamedQuery(name = "BlogDescricao.findByNseq", query = "SELECT b FROM BlogDescricao b WHERE b.nseq = :nseq")
    , @NamedQuery(name = "BlogDescricao.findByDescricao", query = "SELECT b FROM BlogDescricao b WHERE b.descricao = :descricao")
    , @NamedQuery(name = "BlogDescricao.findByHasTitulo", query = "SELECT b FROM BlogDescricao b WHERE b.hasTitulo = :hasTitulo")
    , @NamedQuery(name = "BlogDescricao.findByTitulo", query = "SELECT b FROM BlogDescricao b WHERE b.titulo = :titulo")
    , @NamedQuery(name = "BlogDescricao.findByHasImagem", query = "SELECT b FROM BlogDescricao b WHERE b.hasImagem = :hasImagem")})
public class BlogDescricao implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Nseq")
    private String nseq;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Descricao")
    private String descricao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hasTitulo")
    private boolean hasTitulo;
    @Size(max = 45)
    @Column(name = "Titulo")
    private String titulo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "hasImagem")
    private boolean hasImagem;
    @JoinColumn(name = "ID_blog", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Blog iDblog;
    @JoinColumn(name = "ID_imagem", referencedColumnName = "ID")
    @ManyToOne
    private Imagens iDimagem;

    public BlogDescricao() {
    }

    public BlogDescricao(Integer id) {
        this.id = id;
    }

    public BlogDescricao(Integer id, String nseq, String descricao, boolean hasTitulo, boolean hasImagem) {
        this.id = id;
        this.nseq = nseq;
        this.descricao = descricao;
        this.hasTitulo = hasTitulo;
        this.hasImagem = hasImagem;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNseq() {
        return nseq;
    }

    public void setNseq(String nseq) {
        this.nseq = nseq;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public boolean getHasTitulo() {
        return hasTitulo;
    }

    public void setHasTitulo(boolean hasTitulo) {
        this.hasTitulo = hasTitulo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public boolean getHasImagem() {
        return hasImagem;
    }

    public void setHasImagem(boolean hasImagem) {
        this.hasImagem = hasImagem;
    }

    public Blog getIDblog() {
        return iDblog;
    }

    public void setIDblog(Blog iDblog) {
        this.iDblog = iDblog;
    }

    public Imagens getIDimagem() {
        return iDimagem;
    }

    public void setIDimagem(Imagens iDimagem) {
        this.iDimagem = iDimagem;
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
        if (!(object instanceof BlogDescricao)) {
            return false;
        }
        BlogDescricao other = (BlogDescricao) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.BlogDescricao[ id=" + id + " ]";
    }
    
}
