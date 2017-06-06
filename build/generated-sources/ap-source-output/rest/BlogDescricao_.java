package rest;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rest.Blog;
import rest.Imagens;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-05T22:36:39")
@StaticMetamodel(BlogDescricao.class)
public class BlogDescricao_ { 

    public static volatile SingularAttribute<BlogDescricao, Imagens> iDimagem;
    public static volatile SingularAttribute<BlogDescricao, String> nseq;
    public static volatile SingularAttribute<BlogDescricao, Boolean> hasTitulo;
    public static volatile SingularAttribute<BlogDescricao, Blog> iDblog;
    public static volatile SingularAttribute<BlogDescricao, Boolean> hasImagem;
    public static volatile SingularAttribute<BlogDescricao, String> titulo;
    public static volatile SingularAttribute<BlogDescricao, Integer> id;
    public static volatile SingularAttribute<BlogDescricao, String> descricao;

}