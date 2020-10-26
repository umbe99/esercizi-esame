/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppoesame.eserciziEsame.service;

import gruppoesame.eserciziEsame.model.Contatti;
import gruppoesame.eserciziEsame.model.DtoContatto;
import java.util.List;

/**
 *
 * @author gianmarco
 */
public interface CrudDto {
       //Create
    public DtoContatto creaContattoDto(DtoContatto dto);

    //Read
    public DtoContatto listaContattiDto();

    //Update
    public DtoContatto modificaContattoDto(DtoContatto dto);

    //Delete
    public DtoContatto cancellaContattoDto(DtoContatto dto);
     
}
