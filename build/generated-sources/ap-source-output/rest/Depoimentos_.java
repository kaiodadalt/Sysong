package rest;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;
import rest.Imagens;
import rest.Ongs;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-06-08T18:58:47")
@StaticMetamodel(Depoimentos.class)
public class Depoimentos_ { 

    public static volatile SingularAttribute<Depoimentos, Imagens> iDimagem;
    public static volatile SingularAttribute<Depoimentos, String> tipo;
    public static volatile SingularAttribute<Depoimentos, Ongs> iDong;
    public static volatile SingularAttribute<Depoimentos, String> nome;
    public static volatile SingularAttribute<Depoimentos, Integer> id;
    public static volatile SingularAttribute<Depoimentos, String> descricao;

}