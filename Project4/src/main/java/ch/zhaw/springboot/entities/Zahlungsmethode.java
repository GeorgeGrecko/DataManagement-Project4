package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Zahlungsmethode {
    
    @Id
    private long id;

    private String art;

    public Zahlungsmethode(String art) {
        this.art = art;
    }

    public Zahlungsmethode() {

    }

    public String getArt() {
       return art;
    }

}
