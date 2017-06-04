/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rest.service;

import java.util.Set;
import javax.ws.rs.core.Application;

/**
 *
 * @author Admin
 */
@javax.ws.rs.ApplicationPath("webresources")
public class ApplicationConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> resources = new java.util.HashSet<>();
        addRestResourceClasses(resources);
        return resources;
    }

    /**
     * Do not modify addRestResourceClasses() method.
     * It is automatically populated with
     * all resources defined in the project.
     * If required, comment out calling this method in getClasses().
     */
    private void addRestResourceClasses(Set<Class<?>> resources) {
        resources.add(rest.service.BlogDescricaoFacadeREST.class);
        resources.add(rest.service.BlogFacadeREST.class);
        resources.add(rest.service.CategoriasFacadeREST.class);
        resources.add(rest.service.ComentariosBlogFacadeREST.class);
        resources.add(rest.service.DepoimentosFacadeREST.class);
        resources.add(rest.service.DoacaoFacadeREST.class);
        resources.add(rest.service.ImagensFacadeREST.class);
        resources.add(rest.service.MapaFacadeREST.class);
        resources.add(rest.service.ObjetivosProjetoFacadeREST.class);
        resources.add(rest.service.OngsFacadeREST.class);
        resources.add(rest.service.PaginasFacadeREST.class);
        resources.add(rest.service.ParametrosFacadeREST.class);
        resources.add(rest.service.ProjetosFacadeREST.class);
        resources.add(rest.service.UsuariosFacadeREST.class);
    }
    
}
