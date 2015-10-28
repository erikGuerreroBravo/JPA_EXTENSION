/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Abstract;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author Erik Guerrero Bravo Version 1.0.0
 */
public abstract class Configuration {
    
    //private static String persistenceName ="DataAccessPuntoVentaPU";
      
    public static EntityManagerFactory getEntityManager()
    {
        return Persistence.createEntityManagerFactory("DataAccessPuntoVentaPU");
    }
}
