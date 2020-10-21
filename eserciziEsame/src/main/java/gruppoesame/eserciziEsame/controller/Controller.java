/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppoesame.eserciziEsame.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author gianmarco
 */
@CrossOrigin("*")
@RestController
public class Controller {
   
  /*  @Autowired
    SrvCat srvCat;

    @RequestMapping("/aggiungiCategoria")
    @ResponseBody

    public CategoriaDto aggiungiCategoria(@RequestBody CategoriaDto dto) {
        
        dto.setLista(srvCat.aggiungiCategoria(dto.getCategoria().getDescrizione()));
        return dto;
    }
    */
}
