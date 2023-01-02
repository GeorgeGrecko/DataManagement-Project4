package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity 
public class Lieferanten { 
    @Id 
    private long id;
    private String firma;
   
    @ManyToOne
    private Produkte produkt;
    
    public Lieferanten (String firma, Produkte produkt) {
        this.firma = firma;
        this.produkt = produkt;
    }

    public Lieferanten() {

    }
    
    public String getFirma() {
        return firma;
    }

    public Produkte getProdukt() {
        return this.produkt;
    }
}
