/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppoesame.eserciziEsame.repository;

import gruppoesame.eserciziEsame.model.Contatti;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

/**
 *
 * @author gianmarco
 */
@Repository
public interface RepContatti extends JpaRepository<Contatti, Long> {

    @Query("SELECT c FROM Contatti c ORDER BY Id")
    List<Contatti> trovaPerId();
    
    //List<Contatti> findByidLike(id);

    @Query("SELECT c FROM Contatti c WHERE c.nome Like %:criterio% or c.cognome like %:criterio% or c.telefono like %:criterio%")
    List<Contatti> cercaNome(@Param("criterio") String criterio);
    

}
