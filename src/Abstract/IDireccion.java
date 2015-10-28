/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Abstract;

import Concrete.exceptions.IllegalOrphanException;
import Concrete.exceptions.NonexistentEntityException;
import Model.Direccion;
import java.util.List;

/**
 *
 * @author Programer
 */
public interface IDireccion {

    void create(Direccion direccion);

    void destroy(Integer id) throws IllegalOrphanException, NonexistentEntityException;

    void edit(Direccion direccion) throws IllegalOrphanException, NonexistentEntityException, Exception;

    Direccion findDireccion(Integer id);

    List<Direccion> findDireccionEntities();

    List<Direccion> findDireccionEntities(int maxResults, int firstResult);

    int getDireccionCount();
    
}
