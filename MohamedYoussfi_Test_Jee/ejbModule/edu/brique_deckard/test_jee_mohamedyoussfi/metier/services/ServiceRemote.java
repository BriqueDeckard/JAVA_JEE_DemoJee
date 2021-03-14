// File MySessionBean.java
package edu.brique_deckard.test_jee_mohamedyoussfi.metier.services;

import java.util.List;

import javax.ejb.Remote;

import edu.brique_deckard.test_jee_mohamedyoussfi.metier.entities.EjbEntity;

/**
 * <b><u>MySessionBean : </u></b><br/>
 * <br/>
 * Interface dans laquelle on va déclarer toutes les méthodes accessibles à
 * distance
 * <br/>
 *
 * @author BriqueDeckard<br/>
 */
@Remote
public interface ServiceRemote {

    /**
     * <u><b>addEntityBean : </b></u><br/>
     * Add the entity
     * <br/>
     * 
     * @param entity
     * @return
     */
    public EjbEntity addEntityBean(EjbEntity entity);

    /**
     * <u><b>getEntityBean : </b></u><br/>
     * Get the entity corresponding to the code
     * <br/>
     * 
     * @param code
     * @return
     */
    public EjbEntity getEntityBean(Long code);

    /**
     * <u><b>getAllEntityBeans : </b></u><br/>
     * get all the entities
     * <br/>
     * 
     * @return
     */
    public List<EjbEntity> getAllEntityBeans();

    /**
     * <u><b>doSomething : </b></u><br/>
     * Does something.
     * <br/>
     * 
     * @param something
     */
    public String doSomething(String something);

}
