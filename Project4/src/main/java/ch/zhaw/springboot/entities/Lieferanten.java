package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Lieferanten { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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
