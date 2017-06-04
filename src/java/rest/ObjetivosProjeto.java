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
@Table(name = "objetivosprojeto")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ObjetivosProjeto.findAll", query = "SELECT o FROM ObjetivosProjeto o")
    , @NamedQuery(name = "ObjetivosProjeto.findById", query = "SELECT o FROM ObjetivosProjeto o WHERE o.id = :id")
    , @NamedQuery(name = "ObjetivosProjeto.findByDescricao", query = "SELECT o FROM ObjetivosProjeto o WHERE o.descricao = :descricao")
    , @NamedQuery(name = "ObjetivosProjeto.findByNseq", query = "SELECT o FROM ObjetivosProjeto o WHERE o.nseq = :nseq")})
public class ObjetivosProjeto implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 160)
    @Column(name = "Descricao")
    private String descricao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "nseq")
    private int nseq;
    @JoinColumn(name = "ID_projeto", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Projetos iDprojeto;

    public ObjetivosProjeto() {
    }

    public ObjetivosProjeto(Integer id) {
        this.id = id;
    }

    public ObjetivosProjeto(Integer id, String descricao, int nseq) {
        this.id = id;
        this.descricao = descricao;
        this.nseq = nseq;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getNseq() {
        return nseq;
    }

    public void setNseq(int nseq) {
        this.nseq = nseq;
    }

    public Projetos getIDprojeto() {
        return iDprojeto;
    }

    public void setIDprojeto(Projetos iDprojeto) {
        this.iDprojeto = iDprojeto;
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
        if (!(object instanceof ObjetivosProjeto)) {
            return false;
        }
        ObjetivosProjeto other = (ObjetivosProjeto) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.ObjetivosProjeto[ id=" + id + " ]";
    }
    
}
