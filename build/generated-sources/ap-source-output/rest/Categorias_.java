package rest;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rest.Blog;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-08T18:58:47")
@StaticMetamodel(Categorias.class)
public class Categorias_ { 

    public static volatile CollectionAttribute<Categorias, Blog> blogCollection;
    public static volatile SingularAttribute<Categorias, String> nome;
    public static volatile SingularAttribute<Categorias, Integer> id;

}