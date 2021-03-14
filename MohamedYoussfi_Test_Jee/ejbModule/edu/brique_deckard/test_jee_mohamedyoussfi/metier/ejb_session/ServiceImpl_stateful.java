// File EjbSession_serviceImpl.java
package edu.brique_deckard.test_jee_mohamedyoussfi.metier.ejb_session;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Singleton;
import javax.ejb.Stateful;

import edu.brique_deckard.test_jee_mohamedyoussfi.metier.entities.EjbEntity;
import edu.brique_deckard.test_jee_mohamedyoussfi.metier.services.ServiceLocal;
import edu.brique_deckard.test_jee_mohamedyoussfi.metier.services.ServiceRemote;

/**
 * <b><u>EjbSession_serviceImpl : </u></b><br/>
 * <br/>
 * Implémentation des deux interfaces Local et remote
 * <br/>
 * Stateful signifie qu'il a un état. pour chaque création du client, il y a
 * création d'une instance
 *
 * @author BriqueDeckard<br/>
 */
// @Stateful
public class ServiceImpl_stateful { // implements ServiceLocal, ServiceRemote {

    /**
     * addEntityBean<br/>
     *
     * @see edu.brique_deckard.test_jee_mohamedyoussfi.metier.services.ServiceRemote#addEntityBean(edu.brique_deckard.test_jee_mohamedyoussfi.metier.entities.EjbEntity)<br/>
     */
    // @Override
    public EjbEntity addEntityBean(EjbEntity entity) {
        return entity;
    }

    /**
     * getEntityBean<br/>
     *
     * @see edu.brique_deckard.test_jee_mohamedyoussfi.metier.services.ServiceRemote#getEntityBean(java.lang.Long)<br/>
     */
    // @Override
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
    // @Override
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
    // @Override
    public String doSomething(String something) {
        return "STATELESS " + something + " : ";

    }

}
