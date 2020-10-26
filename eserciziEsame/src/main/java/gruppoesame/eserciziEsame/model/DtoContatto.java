/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppoesame.eserciziEsame.model;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;

/**
 *
 * @author gianmarco
 */

public class DtoContatto {
    //lista contatto msg
    //cassetta degli attrezzi
    private Contatti contatto;
    private List<Contatti> lista=new ArrayList<>();
    private String msg;

    public Contatti getContatto() {
        return contatto;
    }

    public void setContatto(Contatti contatto) {
        this.contatto = contatto;
    }

    public List<Contatti> getLista() {
        return lista;
    }

    public void setLista(List<Contatti> lista) {
        this.lista = lista;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    
    
}
