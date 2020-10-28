/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppoesame.eserciziEsame.controller;

import gruppoesame.eserciziEsame.model.DtoContatto;
import gruppoesame.eserciziEsame.service.CrudDto;
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
public class CotrollerDto {

    @Autowired
    CrudDto crudDto;

    @RequestMapping("/creaContattoDto")
    @ResponseBody
    public DtoContatto creaContattoDto(@RequestBody DtoContatto dto) {
        crudDto.creaContattoDto(dto);
        return dto;
    }

    //legge i contatti dal db
    @RequestMapping("/listaContattiDto")
    @ResponseBody
    public DtoContatto listaContattiDto(DtoContatto dto) {
        dto = crudDto.listaContattiDto();
        return dto;
    }

    //modifica un contatto
    @RequestMapping("/modificaContattoDto")
    @ResponseBody
    public DtoContatto modificaContattoDto(@RequestBody DtoContatto dto) {
        crudDto.modificaContattoDto(dto);
        return dto;
    }

    //cancella un contatto
    @RequestMapping("/cancellaContattoDto")
    @ResponseBody
    public DtoContatto cancellaContattoDto(@RequestBody DtoContatto dto) {
        crudDto.cancellaContattoDto(dto);
        return dto;
    }
}
