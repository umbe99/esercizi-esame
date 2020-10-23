/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppoesame.eserciziEsame.controller;

import gruppoesame.eserciziEsame.model.Contatti;
import gruppoesame.eserciziEsame.service.Crud;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gianmarco
 */
@CrossOrigin("*")
@RestController
public class Controller {
   
    @Autowired
    Crud crud;
/*
    @RequestMapping("/aggiungiCategoria")
    @ResponseBody

    public CategoriaDto aggiungiCategoria(@RequestBody CategoriaDto dto) {
        
        dto.setLista(srvCat.aggiungiCategoria(dto.getCategoria().getDescrizione()));
        return dto;
    }
    */
    
    /*CRUD
    Create
    Read
    Update
    Delete
    */
    
    //crea un contatto
    @RequestMapping("/aggiungiContatto")
    @ResponseBody
    public List<Contatti> aggiungiContatto(@RequestBody Contatti contatto){
        crud.creaContatto(contatto);
        return crud.listaContatti();
}
    //legge i contatti dal db
     @RequestMapping("/listaContatti")
    @ResponseBody
    public List<Contatti> listaContatti(){
        return crud.listaContatti();
}
    //modifica un contatto
     @RequestMapping("/modificaContatto")
    @ResponseBody
    public List<Contatti> modificaContatto(@RequestBody Contatti contatto){
        crud.modificaContatto(contatto);
        return crud.listaContatti();
}
    //cancella un contatto
     @RequestMapping("/cancellaContatto")
    @ResponseBody
    public List<Contatti> cancellaContatto(@RequestBody Contatti contatto){
        crud.cancellaContatto(contatto);
        return crud.listaContatti();
}
    
}
