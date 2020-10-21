/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gruppoesame.eserciziEsame.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


/**
 *
 * @author gianmarco
 */
@Entity
public class Contatti {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column
    private String nome;
    @Column
    private String cognome;
    @Column
    private String telefono;
  
      /*  @OneToMany(mappedBy = "Contatti")
    @JsonIgnoreProperties(value = "contatti", allowSetters = true)
    private List<Telefono> telefono = new ArrayList<>();
    
    @ManyToOne
    @JoinColumn(referencedColumnName = "id")
    @JsonIgnoreProperties(value = "contatti", allowSetters = true)
    Contatti contatti;

 contatto+ tel1
 tel3
    
    
    
    tel2 contatto1 ->contatto2
    */
    public Contatti() {
    }

    public Contatti(String nome, String cognome, String telefono) {
        this.nome = nome;
        this.cognome = cognome;
        this.telefono = telefono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

}
