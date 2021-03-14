// File EjbSession_stateless_servicImpl.java
package edu.brique_deckard.test_jee_mohamedyoussfi.metier.ejb_session;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import edu.brique_deckard.test_jee_mohamedyoussfi.metier.entities.EjbEntity;
import edu.brique_deckard.test_jee_mohamedyoussfi.metier.services.ServiceLocal;
import edu.brique_deckard.test_jee_mohamedyoussfi.metier.services.ServiceRemote;

/**
 * <b><u>EjbSession_stateless_servicImpl : </u></b><br/>
 * <br/>
 * Implémentation des deux interfaces Local et remote
 * <br/>
 * Stateless : une seule instance, mais le conteneur EJB gère la charge la
 * répartie.
 * <br/>
 * (name="SERVICE1") désigne le nom sous lequel le service est publié dans
 * l'annuaire
 * <br/>
 *
 * @author BriqueDeckard<br/>
 */
@Stateless(name = "ServiceImpl_stateless")
public class ServiceImpl_stateless implements ServiceRemote, ServiceLocal {

    /**
     * addEntityBean<br/>
     *
     * @see edu.brique_deckard.test_jee_mohamedyoussfi.metier.services.ServiceRemote#addEntityBean(edu.brique_deckard.test_jee_mohamedyoussfi.metier.entities.EjbEntity)<br/>
     */
    @Override
    public EjbEntity addEntityBean(EjbEntity entity) {
        return entity;
    }

    /**
     * getEntityBean<br/>
     *
     * @see edu.brique_deckard.test_jee_mohamedyoussfi.metier.services.ServiceRemote#getEntityBean(java.lang.Long)<br/>
     */
    @Override
    public EjbEntity getEntityBean(Long code) {
        EjbEntity entity = new EjbEntity();
        entity.setCode(code);
        entity.setBoolValue(true);
        entity.setIntValue(42);
        entity.setStringValue("HelloWorld");

        return entity;
    }

    /**
     * getAllEntityBeans<br/>
     *
     * @see edu.brique_deckard.test_jee_mohamedyoussfi.metier.services.ServiceRemote#getAllEntityBeans()<br/>
     */
    @Override
    public List<EjbEntity> getAllEntityBeans() {

        EjbEntity entity = new EjbEntity();
        entity.setCode(42l);
        entity.setBoolValue(true);
        entity.setIntValue(42);
        entity.setStringValue("HelloWorld");

        ArrayList<EjbEntity> list = new ArrayList<>();
        list.add(entity);

        return list;
    }

    /**
     * doSomething<br/>
     *
     * @see edu.brique_deckard.test_jee_mohamedyoussfi.metier.services.ServiceRemote#doSomething(java.lang.String)<br/>
     */
    @Override
    public String doSomething(String something) {
        return "STATELESS " + something + " : ";

    }

}
