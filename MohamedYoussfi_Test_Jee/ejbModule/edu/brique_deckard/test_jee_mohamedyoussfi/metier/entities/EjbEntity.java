// File EjbEntity.java
package edu.brique_deckard.test_jee_mohamedyoussfi.metier.entities;

import java.io.Serializable;

import javax.persistence.Entity;

/**
 * <b><u>EjbEntity : </u></b><br/>
 * <br/>
 * Entity bean
 * <br/>
 *
 * @author BriqueDeckard<br/>
 */
public class EjbEntity implements Serializable{

    /**
     * <b><u>serialVersionUID</b></u><br/>
     * Serial UID for the bean
     * <br/>
     */
    private static final long serialVersionUID = 2745133310876708048L;
    /**
     * <b><u>code</b></u><br/>
     * Identifiant
     * <br/>
     */
    private Long code;
    /**
     * <b><u>stringValue</b></u><br/>
     * String value
     * <br/>
     */
    private String stringValue;
    /**
     * <b><u>boolValue</b></u><br/>
     * Boolean value
     * <br/>
     */
    private Boolean boolValue;
    /**
     * <b><u>intValue</b></u><br/>
     * Integer value.
     * <br/>
     */
    private Integer intValue;

    /**
     * Gets code<br/>
     * 
     * @return the code
     */
    public Long getCode() {
        return code;
    }

    /**
     * Sets code<br/>
     * 
     * @param code the code to set
     */
    public void setCode(Long code) {
        this.code = code;
    }

    /**
     * Gets stringValue<br/>
     * 
     * @return the stringValue
     */
    public String getStringValue() {
        return stringValue;
    }

    /**
     * Sets stringValue<br/>
     * 
     * @param stringValue the stringValue to set
     */
    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    /**
     * Gets boolValue<br/>
     * 
     * @return the boolValue
     */
    public Boolean getBoolValue() {
        return boolValue;
    }

    /**
     * Sets boolValue<br/>
     * 
     * @param boolValue the boolValue to set
     */
    public void setBoolValue(Boolean boolValue) {
        this.boolValue = boolValue;
    }

    /**
     * Gets intValue<br/>
     * 
     * @return the intValue
     */
    public Integer getIntValue() {
        return intValue;
    }

    /**
     * Sets intValue<br/>
     * 
     * @param intValue the intValue to set
     */
    public void setIntValue(Integer intValue) {
        this.intValue = intValue;
    }

}
