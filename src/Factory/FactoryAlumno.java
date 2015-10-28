/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Factory;
import Abstract.Configuration;
import Abstract.IAlumnos;
import Concrete.AlumnoJpaController;
import ConcreteExtends.AlumnoJPAExtends;
import Model.Alumno;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erik Guerrero Bravo Version 1.0.0
 */
public  class FactoryAlumno {
    
    private static  FactoryAlumno  factory;
   
    static 
    {
        try 
        {
           factory =  FactoryAlumno.class.newInstance();
        }
        catch (IllegalAccessException | InstantiationException ex) {
            Logger.getLogger(FactoryAlumno.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    public static FactoryAlumno getInstance()
    {
        return factory;
    }
    public IAlumnos  getInstanceAbstract()
    {
       try
       {
         // return  (IAlumnos) new AlumnoJpaController();
           AlumnoJpaController ctrlAlumno = new AlumnoJpaController();
           return (IAlumnos) ctrlAlumno;
       }
       catch(Exception ex)
       {
           return null;
       }
    }
    
    public Alumno getInstanceEspecific(String nombre, String ApellidoPaterno)
    {
        try
        {
            AlumnoJPAExtends  ctrlAlumnoExtends = new AlumnoJPAExtends();
            return ctrlAlumnoExtends.findAlumnoByNombre(nombre,ApellidoPaterno);
        }
        catch(Exception ex)
        {
            System.out.println("El error  esta  aqui   "+ex.getMessage());
            return null;
        }
    }
    
    public  Alumno getInstanceEspecificByNumeroControl(Alumno alumno)
    {
        try
        {
            AlumnoJPAExtends  ctrlAlumnoExtends = new AlumnoJPAExtends();
            return ctrlAlumnoExtends.findAlumnoByNumeroControl(alumno) ;
        }
        catch(Exception ex)
        {
            System.out.println("El error  esta  aqui   "+ex.getMessage());
            return null;
        }
    }
    
    public  List<Alumno> getAllInstanceAlumno()
    {
        try
        {
            AlumnoJPAExtends  ctrlAlumnoExtends = new AlumnoJPAExtends();
            return ctrlAlumnoExtends.findAllAlumnos();
        }
        catch(Exception ex)
        {
            System.out.println("El error  esta  aqui   "+ex.getMessage());
            return null;
        }
    }
    
    public List<Alumno> getInstanceLikeNombre(String nombre)
    {
        try
        {
            AlumnoJPAExtends ctrlAlumnoExtends = new AlumnoJPAExtends();
            return ctrlAlumnoExtends.findAlumnoLikeByNombre(nombre);
        }
        catch(Exception ex)
        {
            System.out.println("El error  esta  aqui   "+ex.getMessage());
            return null;
        }
    }
    
     public List<Alumno> getInstanceDistinctNombre()
    {
        try
        {
            AlumnoJPAExtends ctrlAlumnoExtends = new AlumnoJPAExtends();
            return ctrlAlumnoExtends.findAlumnoDistinct();
        }
        catch(Exception ex)
        {
            System.out.println("El error  esta  aqui   "+ex.getMessage());
            return null;
        }
    }
 
     public List<Alumno> getInstanceCriteriaInstanceAlumno()
     {
         try
         {
             AlumnoJPAExtends ctrlAlumnoExtends = new AlumnoJPAExtends();
             return ctrlAlumnoExtends.findAlumnoCriteriaQuery();
         }
         catch(Exception ex)
         {
             return null;
         }
     }
     public List<Alumno> getInstanceAlumnoBetween(int idInicial, int idFinal)
     {
         try
         {
             AlumnoJPAExtends ctrlAlumnoExtends = new AlumnoJPAExtends();
             return ctrlAlumnoExtends.findAlumnoBetweenId(idInicial, idFinal);
         }
         catch(Exception ex)
         {
             return null;
         }
     }
     
     
     
}