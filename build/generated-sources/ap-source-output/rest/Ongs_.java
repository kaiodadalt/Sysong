package rest;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rest.Blog;
import rest.Depoimentos;
import rest.Doacao;
import rest.Imagens;
import rest.Mapa;
import rest.Paginas;
import rest.Parametros;
import rest.Projetos;
import rest.Usuarios;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-08T18:58:47")
@StaticMetamodel(Ongs.class)
public class Ongs_ { 

    public static volatile CollectionAttribute<Ongs, Blog> blogCollection;
    public static volatile CollectionAttribute<Ongs, Projetos> projetosCollection;
    public static volatile SingularAttribute<Ongs, Usuarios> iDusuario;
    public static volatile CollectionAttribute<Ongs, Parametros> parametrosCollection;
    public static volatile SingularAttribute<Ongs, String> nome;
    public static volatile CollectionAttribute<Ongs, Doacao> doacaoCollection;
    public static volatile CollectionAttribute<Ongs, Depoimentos> depoimentosCollection;
    public static volatile SingularAttribute<Ongs, Integer> id;
    public static volatile CollectionAttribute<Ongs, Paginas> paginasCollection;
    public static volatile SingularAttribute<Ongs, Mapa> iDmapa;
    public static volatile CollectionAttribute<Ongs, Imagens> imagensCollection;

}