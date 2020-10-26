/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppoesame.eserciziEsame.serviceImpl;

import gruppoesame.eserciziEsame.model.Contatti;
import gruppoesame.eserciziEsame.model.DtoContatto;
import gruppoesame.eserciziEsame.repository.RepContatti;
import gruppoesame.eserciziEsame.service.CrudDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gianmarco
 */
@Service
public class CrudDtoImpl implements CrudDto {

    @Autowired
    RepContatti repC;
    
    @Override
    public DtoContatto creaContattoDto(DtoContatto dto) {
        //   contatto = repC.save(contatto);
        Contatti contatto = dto.getContatto();
        contatto = repC.save(contatto);
        dto = listaContattiDto();
        return dto;
    }
    
    @Override
    public DtoContatto listaContattiDto() {
        //  List<Contatti> listaC = new ArrayList<>();
        //   listaC = repC.trovaPerId();  
        DtoContatto dto = new DtoContatto();
        dto.setLista(repC.trovaPerId());
        return dto;
    }
    
    @Override
    public DtoContatto modificaContattoDto(DtoContatto dto) {
        //repC.save(contatto);
        repC.save(dto.getContatto());
        dto = listaContattiDto();
        return dto;
    }
    
    @Override
    public DtoContatto cancellaContattoDto(DtoContatto dto) {
        //repC.deleteById(contatto.getId());
        repC.deleteById(dto.getContatto().getId());
        dto = listaContattiDto();
        return dto;
    }
    
}
