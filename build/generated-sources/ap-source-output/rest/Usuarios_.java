package rest;

import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rest.Ongs;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-05T22:36:39")
@StaticMetamodel(Usuarios.class)
public class Usuarios_ { 

    public static volatile SingularAttribute<Usuarios, String> senha;
    public static volatile SingularAttribute<Usuarios, String> nome;
    public static volatile SingularAttribute<Usuarios, String> usuario;
    public static volatile SingularAttribute<Usuarios, Integer> id;
    public static volatile SingularAttribute<Usuarios, String> sobrenome;
    public static volatile CollectionAttribute<Usuarios, Ongs> ongsCollection;
    public static volatile SingularAttribute<Usuarios, String> email;

}