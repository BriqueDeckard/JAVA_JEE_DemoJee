package edu.brique_deckard.test_jee_mohamedyoussfi.client;
import java.util.List;
import java.util.Properties;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import edu.brique_deckard.test_jee_mohamedyoussfi.metier.entities.EjbEntity;
import edu.brique_deckard.test_jee_mohamedyoussfi.metier.services.ServiceRemote;

// File ClientRemote.java

/**
 * <b><u>ClientRemote : </u></b><br/>
 * <br/>
 * Client Java pour l'application TestJee
 * <br/>
 *
 * @author BriqueDeckard<br/>
 */
public class ClientRemote {

    /**
     * <u><b>main : </b></u><br/>
     * Point d'entrée du programme
     * <br/>
     * 
     * @param args
     */
    public static void main(String[] args) {

        try {
            Properties properties = new Properties();

            // le contexte à besoin de propriétés
            properties.put(Context.INITIAL_CONTEXT_FACTORY,
                "com.sun.enterprise.naming.SerialInitContextFactory");
            properties.setProperty("org.omg.CORBA.ORBInitialHost", "localhost");
            properties.setProperty("org.omg.CORBA.ORBInitialPort", "3700");

            Context context = new InitialContext();

            // On indique le chemin pour le lookup
            String appName = "";
            String moduleName = "MohamedYoussfi_Test_Jee";
            String beanName = "ServiceImpl_stateless";
            String remoteInterface = ServiceRemote.class.getName();

            String name = "java:global/" + moduleName + "/" + beanName + "!" + remoteInterface;

            // Recupération du service
            ServiceRemote proxy = (ServiceRemote) context.lookup(name);

            // Utilisation du service
            System.out.println(proxy.doSomething("Hello ?"));
            // [ ADD ]
            EjbEntity entityToSave = new EjbEntity();
            entityToSave.setCode(42l);
            entityToSave.setBoolValue(true);
            entityToSave.setIntValue(42);
            entityToSave.setStringValue("Hello ! ");

            EjbEntity savedEntity = proxy.addEntityBean(entityToSave);

            System.out.println("Code : " + savedEntity.getCode());
            System.out.println("Bool : " + savedEntity.getBoolValue());
            System.out.println("Int : " + savedEntity.getIntValue());
            System.out.println("String : " + savedEntity.getStringValue());

            // [ GET ]
            EjbEntity gotEntity = proxy.getEntityBean(42l);

            System.out.println("Code : " + gotEntity.getCode());
            System.out.println("Bool : " + gotEntity.getBoolValue());
            System.out.println("Int : " + gotEntity.getIntValue());
            System.out.println("String : " + gotEntity.getStringValue());

            // [ GET ALL ]
            List<EjbEntity> all = proxy.getAllEntityBeans();

            for (EjbEntity ejbEntity : all) {
                System.out.println("Code : " + ejbEntity.getCode());
                System.out.println("Bool : " + ejbEntity.getBoolValue());
                System.out.println("Int : " + ejbEntity.getIntValue());
                System.out.println("String : " + ejbEntity.getStringValue());
            }

        } catch (NamingException e) {
            e.printStackTrace();
        }

    }

}
