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
@Table(name = "comentariosblog")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ComentariosBlog.findAll", query = "SELECT c FROM ComentariosBlog c")
    , @NamedQuery(name = "ComentariosBlog.findById", query = "SELECT c FROM ComentariosBlog c WHERE c.id = :id")
    , @NamedQuery(name = "ComentariosBlog.findByNome", query = "SELECT c FROM ComentariosBlog c WHERE c.nome = :nome")
    , @NamedQuery(name = "ComentariosBlog.findByDescricao", query = "SELECT c FROM ComentariosBlog c WHERE c.descricao = :descricao")
    , @NamedQuery(name = "ComentariosBlog.findByDataComentario", query = "SELECT c FROM ComentariosBlog c WHERE c.dataComentario = :dataComentario")
    , @NamedQuery(name = "ComentariosBlog.findByEmail", query = "SELECT c FROM ComentariosBlog c WHERE c.email = :email")
    , @NamedQuery(name = "ComentariosBlog.findByIp", query = "SELECT c FROM ComentariosBlog c WHERE c.ip = :ip")})
public class ComentariosBlog implements Serializable {

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
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 160)
    @Column(name = "Descricao")
    private String descricao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "DataComentario")
    private String dataComentario;
    // @Pattern(regexp="[a-z0-9!#$%&'*+/=?^_`{|}~-]+(?:\\.[a-z0-9!#$%&'*+/=?^_`{|}~-]+)*@(?:[a-z0-9](?:[a-z0-9-]*[a-z0-9])?\\.)+[a-z0-9](?:[a-z0-9-]*[a-z0-9])?", message="Invalid email")//if the field contains email address consider using this annotation to enforce field validation
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Email")
    private String email;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "IP")
    private String ip;
    @JoinColumn(name = "ID_blog", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Blog iDblog;
    @JoinColumn(name = "ID_imagem", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Imagens iDimagem;

    public ComentariosBlog() {
    }

    public ComentariosBlog(Integer id) {
        this.id = id;
    }

    public ComentariosBlog(Integer id, String nome, String descricao, String dataComentario, String email, String ip) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataComentario = dataComentario;
        this.email = email;
        this.ip = ip;
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

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataComentario() {
        return dataComentario;
    }

    public void setDataComentario(String dataComentario) {
        this.dataComentario = dataComentario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
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
        if (!(object instanceof ComentariosBlog)) {
            return false;
        }
        ComentariosBlog other = (ComentariosBlog) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.ComentariosBlog[ id=" + id + " ]";
    }
    
}
