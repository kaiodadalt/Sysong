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
@Table(name = "paginas")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Paginas.findAll", query = "SELECT p FROM Paginas p")
    , @NamedQuery(name = "Paginas.findById", query = "SELECT p FROM Paginas p WHERE p.id = :id")
    , @NamedQuery(name = "Paginas.findByChave", query = "SELECT p FROM Paginas p WHERE p.chave = :chave")
    , @NamedQuery(name = "Paginas.findByDescricao", query = "SELECT p FROM Paginas p WHERE p.descricao = :descricao")})
public class Paginas implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "Chave")
    private String chave;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 4000)
    @Column(name = "Descricao")
    private String descricao;
    @JoinColumn(name = "ID_ong", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Ongs iDong;

    public Paginas() {
    }

    public Paginas(Integer id) {
        this.id = id;
    }

    public Paginas(Integer id, String chave, String descricao) {
        this.id = id;
        this.chave = chave;
        this.descricao = descricao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
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
        if (!(object instanceof Paginas)) {
            return false;
        }
        Paginas other = (Paginas) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.Paginas[ id=" + id + " ]";
    }
    
}
