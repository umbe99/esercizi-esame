/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppoesame.eserciziEsame.serviceImpl;

import gruppoesame.eserciziEsame.model.Contatti;
import gruppoesame.eserciziEsame.repository.RepContatti;
import gruppoesame.eserciziEsame.service.Crud;
import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author gianmarco
 */
@Service
public class CrudImpl implements Crud{
@Autowired
RepContatti repC;

    @Override
    public List<Contatti> creaContatto(Contatti contatto) {
        contatto=repC.save(contatto);
       return listaContatti();
    }

    @Override
    public List<Contatti> listaContatti() {
        List<Contatti> listaC = new ArrayList<>();
        listaC=repC.trovaPerId();
        return  listaC;
    }

    @Override
    public List<Contatti> modificaContatto(Contatti contatto) {
      repC.save(contatto); 
      return listaContatti();
    }

    @Override
    public List<Contatti> cancellaContatto(Contatti contatto) {
        repC.deleteById(contatto.getId());
        return listaContatti();
    }

    
}
