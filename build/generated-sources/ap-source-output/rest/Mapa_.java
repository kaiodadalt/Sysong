package rest;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rest.Ongs;
import rest.Projetos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-08T18:58:47")
@StaticMetamodel(Mapa.class)
public class Mapa_ { 

    public static volatile SingularAttribute<Mapa, String> tipo;
    public static volatile CollectionAttribute<Mapa, Projetos> projetosCollection;
    public static volatile SingularAttribute<Mapa, Integer> id;
    public static volatile CollectionAttribute<Mapa, Ongs> ongsCollection;
    public static volatile SingularAttribute<Mapa, String> descricao;

}