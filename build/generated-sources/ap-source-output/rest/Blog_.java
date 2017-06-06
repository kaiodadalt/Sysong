package rest;

import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rest.BlogDescricao;
import rest.Categorias;
import rest.ComentariosBlog;
import rest.Imagens;
import rest.Ongs;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-05T22:36:39")
@StaticMetamodel(Blog.class)
public class Blog_ { 

    public static volatile CollectionAttribute<Blog, ComentariosBlog> comentariosBlogCollection;
    public static volatile SingularAttribute<Blog, Imagens> iDimagem;
    public static volatile SingularAttribute<Blog, Ongs> iDong;
    public static volatile SingularAttribute<Blog, Boolean> visivel;
    public static volatile SingularAttribute<Blog, Date> dataPostagem;
    public static volatile SingularAttribute<Blog, String> titulo;
    public static volatile SingularAttribute<Blog, Integer> id;
    public static volatile SingularAttribute<Blog, Categorias> iDcategoria;
    public static volatile CollectionAttribute<Blog, BlogDescricao> blogDescricaoCollection;
    public static volatile SingularAttribute<Blog, Date> dataAlteracao;

}