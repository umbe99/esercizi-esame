/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppoesame.eserciziEsame.service;

import gruppoesame.eserciziEsame.model.Contatti;
import java.util.List;

/**
 *
 * @author gianmarco
 */
public interface Crud {

    /*CRUD
    Create
    Read
    Update
    Delete
     */
    //Create
    public List<Contatti> creaContatto(Contatti contatto);

    //Read
    public List<Contatti> listaContatti();

    //Update
    public List<Contatti> modificaContatto(Contatti contatto);

    //Delete
    public List<Contatti> cancellaContatto(Contatti contatto);
    
    //Altri metodi
    //public L
}
