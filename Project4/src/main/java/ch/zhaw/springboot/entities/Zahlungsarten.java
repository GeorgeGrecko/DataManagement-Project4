package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Zahlungsarten {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String art;

    public Zahlungsarten(String art) {
        this.art = art;
    }

    public Zahlungsarten() {

    }

    public String getArt() {
       return art;
    }
}
