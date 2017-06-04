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
@Table(name = "depoimentos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Depoimentos.findAll", query = "SELECT d FROM Depoimentos d")
    , @NamedQuery(name = "Depoimentos.findById", query = "SELECT d FROM Depoimentos d WHERE d.id = :id")
    , @NamedQuery(name = "Depoimentos.findByNome", query = "SELECT d FROM Depoimentos d WHERE d.nome = :nome")
    , @NamedQuery(name = "Depoimentos.findByDescricao", query = "SELECT d FROM Depoimentos d WHERE d.descricao = :descricao")
    , @NamedQuery(name = "Depoimentos.findByTipo", query = "SELECT d FROM Depoimentos d WHERE d.tipo = :tipo")})
public class Depoimentos implements Serializable {

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
    @Size(min = 1, max = 45)
    @Column(name = "Descricao")
    private String descricao;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Tipo")
    private String tipo;
    @JoinColumn(name = "ID_imagem", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Imagens iDimagem;
    @JoinColumn(name = "ID_ong", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Ongs iDong;

    public Depoimentos() {
    }

    public Depoimentos(Integer id) {
        this.id = id;
    }

    public Depoimentos(Integer id, String nome, String descricao, String tipo) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.tipo = tipo;
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

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
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

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Depoimentos)) {
            return false;
        }
        Depoimentos other = (Depoimentos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.Depoimentos[ id=" + id + " ]";
    }
    
}
