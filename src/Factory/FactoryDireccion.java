/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory;

import Abstract.IDireccion;
import Concrete.DireccionJpaController;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programer
 */
public  class FactoryDireccion {
    
    private static  FactoryDireccion  factory;
    
    static 
    {
        try 
        {
           //factory =  FactoryDireccion.class.newInstance();
            factory = new FactoryDireccion();
        }
        catch (Exception  ex) {///||IllegalAccessException | InstantiationException
            Logger.getLogger(FactoryDireccion.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static FactoryDireccion getInstance()
    {
        return factory;
    }
    public IDireccion getInstanceAbstract()
    {
       try
       {
          DireccionJpaController ctrlDireccion = new DireccionJpaController();
          return (IDireccion) ctrlDireccion;
                  
       }
       catch(Exception ex)
       {
           return null;
       }
    }
    
    
}
