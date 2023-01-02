package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity 
public class Lieferant { 
    @Id 
    private long id;
    private String firma;
   
    @ManyToOne
    private Produkt produkt;
    
    public Lieferant (String firma, Produkt produkt) {
        this.firma = firma;
        this.produkt = produkt;
    }

    public Lieferant() {

    }
    
    public String getFirma() {
        return firma;
    }

    public Produkt getProdukt() {
        return this.produkt;
    }
    
}
