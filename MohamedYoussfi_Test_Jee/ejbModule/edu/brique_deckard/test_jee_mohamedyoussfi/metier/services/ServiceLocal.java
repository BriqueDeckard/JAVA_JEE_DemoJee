// File MySessionBean_Local.java
package edu.brique_deckard.test_jee_mohamedyoussfi.metier.services;

import java.util.List;

import javax.ejb.Local;

import edu.brique_deckard.test_jee_mohamedyoussfi.metier.entities.EjbEntity;

/**
 * <b><u>MySessionBean_Local : </u></b><br/>
 * <br/>
 * Interface pour un bean local. On déclare toutes les méthodes accessible
 * localement.
 * <br/>
 *
 * @author BriqueDeckard<br/>
 */
@Local
public interface ServiceLocal {

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
