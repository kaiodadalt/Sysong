package rest;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rest.Imagens;
import rest.Mapa;
import rest.ObjetivosProjeto;
import rest.Ongs;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-08T18:58:47")
@StaticMetamodel(Projetos.class)
public class Projetos_ { 

    public static volatile CollectionAttribute<Projetos, ObjetivosProjeto> objetivosProjetoCollection;
    public static volatile SingularAttribute<Projetos, Imagens> iDimagem;
    public static volatile SingularAttribute<Projetos, Date> dataFim;
    public static volatile SingularAttribute<Projetos, Ongs> iDong;
    public static volatile SingularAttribute<Projetos, String> nome;
    public static volatile SingularAttribute<Projetos, Integer> id;
    public static volatile SingularAttribute<Projetos, Date> dataInicio;
    public static volatile SingularAttribute<Projetos, Mapa> iDmapa;
    public static volatile SingularAttribute<Projetos, String> descricao;

}