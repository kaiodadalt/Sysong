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
@Table(name = "projetos")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Projetos.findAll", query = "SELECT p FROM Projetos p")
    , @NamedQuery(name = "Projetos.findById", query = "SELECT p FROM Projetos p WHERE p.id = :id")
    , @NamedQuery(name = "Projetos.findByNome", query = "SELECT p FROM Projetos p WHERE p.nome = :nome")
    , @NamedQuery(name = "Projetos.findByDescricao", query = "SELECT p FROM Projetos p WHERE p.descricao = :descricao")
    , @NamedQuery(name = "Projetos.findByDataInicio", query = "SELECT p FROM Projetos p WHERE p.dataInicio = :dataInicio")
    , @NamedQuery(name = "Projetos.findByDataFim", query = "SELECT p FROM Projetos p WHERE p.dataFim = :dataFim")})
public class Projetos implements Serializable {

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
    @Size(min = 1, max = 4000)
    @Column(name = "Descricao")
    private String descricao;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DataInicio")
    @Temporal(TemporalType.DATE)
    private Date dataInicio;
    @Basic(optional = false)
    @NotNull
    @Column(name = "DataFim")
    @Temporal(TemporalType.DATE)
    private Date dataFim;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "iDprojeto")
    private Collection<ObjetivosProjeto> objetivosProjetoCollection;
    @JoinColumn(name = "ID_imagem", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Imagens iDimagem;
    @JoinColumn(name = "ID_mapa", referencedColumnName = "ID")
    @ManyToOne
    private Mapa iDmapa;
    @JoinColumn(name = "ID_ong", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Ongs iDong;

    public Projetos() {
    }

    public Projetos(Integer id) {
        this.id = id;
    }

    public Projetos(Integer id, String nome, String descricao, Date dataInicio, Date dataFim) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
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

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    @XmlTransient
    public Collection<ObjetivosProjeto> getObjetivosProjetoCollection() {
        return objetivosProjetoCollection;
    }

    public void setObjetivosProjetoCollection(Collection<ObjetivosProjeto> objetivosProjetoCollection) {
        this.objetivosProjetoCollection = objetivosProjetoCollection;
    }

    public Imagens getIDimagem() {
        return iDimagem;
    }

    public void setIDimagem(Imagens iDimagem) {
        this.iDimagem = iDimagem;
    }

    public Mapa getIDmapa() {
        return iDmapa;
    }

    public void setIDmapa(Mapa iDmapa) {
        this.iDmapa = iDmapa;
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
        if (!(object instanceof Projetos)) {
            return false;
        }
        Projetos other = (Projetos) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rest.Projetos[ id=" + id + " ]";
    }
    
}
