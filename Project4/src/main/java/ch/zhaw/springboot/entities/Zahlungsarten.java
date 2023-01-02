package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Zahlungsarten {
    
    @Id
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
