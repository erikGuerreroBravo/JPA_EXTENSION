/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package app;
import Abstract.IAlumnos;
import Abstract.IDireccion;
import ConcreteExtends.AlumnoJPAExtends;
import Factory.FactoryAlumno;
import Factory.FactoryDireccion;
import Model.Alumno;
import Model.Direccion;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Programer
 */
public class ejecutar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
        
        Alumno alumno = new Alumno();
        Direccion direccion = new Direccion();
        ///llenamos el objeto del tipo direccion
        direccion.setCalle("Av.Los Caracoles ");
        direccion.setCiudad("Puerto Vallarta");
        direccion.setNumeroInt("12");
        direccion.setColonia("Las Brisas");
        //FactoryDireccion factori = new FactoryDireccion();
        
        //factori.getInstanceAbstract().
        IDireccion factory = FactoryDireccion.getInstance().getInstanceAbstract();
        
        factory.create(direccion);
        
        ///lleno la entidad alumno
        alumno.setNombre("Erik");
        alumno.setApaterno("Morales");
        alumno.setNcontrol("356242");
        ///vinculo al  alumno con la direccion
        alumno.setIdDireccion(direccion);
        ///creo el objeto del tipo Factoria que se encarga de la instancia de todo elbackground
        IAlumnos factoria =  FactoryAlumno.getInstance().getInstanceAbstract();
        
        factoria.create(alumno);
        */
        /*
        for(int c=0; c < factoria.findAlumnoEntities().size();c++)
        {
            JOptionPane.showMessageDialog(null, factoria.findAlumnoEntities().get(c).getNombre() +"Inner Join :\n"+ factoria.findAlumnoEntities().get(c).getIdDireccion().getCiudad() );
        }
        
        //JOptionPane.showMessageDialog(null, factoria.findAlumnoEntities().get(0));
        
        
        //JOptionPane.showMessageDialog(null,factoria.findAlumno(1).getIdDireccion().getCalle());
        */
        //Alumno alumno= new Alumno();
        //alumno.setNcontrol("134458");
        //Alumno alumno = FactoryAlumno.getInstance().getInstanceEspecific("Miguel","Paz");
        
        //List<Alumno> alumnoObj = FactoryAlumno.getInstance().getAllInstanceAlumno();
        
        //List<Alumno> alumnoObj =  FactoryAlumno.getInstance().getInstanceLikeNombre("Erik");
        //List<Alumno> alumnoObj =  FactoryAlumno.getInstance().getInstanceCriteriaInstanceAlumno();
    ///    List<Alumno> alumnoObj =  FactoryAlumno.getInstance().getInstanceAlumnoBetween(2,5);
           List<Alumno> alumnoObj =  FactoryAlumno.getInstance().getInstanceDistinctNombre();
        for (Alumno alumnoObj1 : alumnoObj) {
            JOptionPane.showMessageDialog(null, alumnoObj1.getNombre() +"\n" + alumnoObj1.getIdDireccion().getCiudad());
        }
        
      
        
    }
    
}
