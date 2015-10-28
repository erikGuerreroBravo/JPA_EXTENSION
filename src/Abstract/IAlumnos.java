/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Abstract;

import Concrete.exceptions.NonexistentEntityException;
import Model.Alumno;
import java.util.List;

/**
 *
 * @author Erik Guerrero Bravo Version 1.0.0
 */
public interface IAlumnos {

    void create(Alumno alumno);

    void destroy(Integer id) throws NonexistentEntityException;

    void edit(Alumno alumno) throws NonexistentEntityException, Exception;

    Alumno findAlumno(Integer id);

    List<Alumno> findAlumnoEntities();

    List<Alumno> findAlumnoEntities(int maxResults, int firstResult);

    int getAlumnoCount();
 
    
    
    
}
