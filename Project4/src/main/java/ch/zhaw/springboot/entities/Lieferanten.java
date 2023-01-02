package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Lieferanten { 
    @Id 
    private long id;
    private String firma;
    
    public Lieferanten (String firma) {
        this.firma = firma;
    }

    public Lieferanten() {

    }
    
    public String getFirma() {
        return firma;
    }
}
