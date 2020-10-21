/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppoesame.eserciziEsame.serviceImpl;

import gruppoesame.eserciziEsame.service.Crud;
import org.springframework.stereotype.Service;

/**
 *
 * @author gianmarco
 */
@Service
public class CrudImpl implements Crud{

    @Override
    public String ciao() {
       return "ciao";
    }
    
}
