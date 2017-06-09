package rest;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rest.Blog;
import rest.BlogDescricao;
import rest.ComentariosBlog;
import rest.Depoimentos;
import rest.Ongs;
import rest.Projetos;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-08T18:58:47")
@StaticMetamodel(Imagens.class)
public class Imagens_ { 

    public static volatile CollectionAttribute<Imagens, ComentariosBlog> comentariosBlogCollection;
    public static volatile CollectionAttribute<Imagens, Blog> blogCollection;
    public static volatile SingularAttribute<Imagens, String> caminhoImagem;
    public static volatile SingularAttribute<Imagens, String> tipo;
    public static volatile CollectionAttribute<Imagens, Projetos> projetosCollection;
    public static volatile SingularAttribute<Imagens, Ongs> iDong;
    public static volatile CollectionAttribute<Imagens, Depoimentos> depoimentosCollection;
    public static volatile SingularAttribute<Imagens, Integer> id;
    public static volatile CollectionAttribute<Imagens, BlogDescricao> blogDescricaoCollection;

}