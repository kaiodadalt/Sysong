package rest;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rest.Blog;
import rest.Imagens;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-05T22:36:39")
@StaticMetamodel(ComentariosBlog.class)
public class ComentariosBlog_ { 

    public static volatile SingularAttribute<ComentariosBlog, Imagens> iDimagem;
    public static volatile SingularAttribute<ComentariosBlog, Blog> iDblog;
    public static volatile SingularAttribute<ComentariosBlog, String> dataComentario;
    public static volatile SingularAttribute<ComentariosBlog, String> ip;
    public static volatile SingularAttribute<ComentariosBlog, String> nome;
    public static volatile SingularAttribute<ComentariosBlog, Integer> id;
    public static volatile SingularAttribute<ComentariosBlog, String> email;
    public static volatile SingularAttribute<ComentariosBlog, String> descricao;

}