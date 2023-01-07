package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;

@Entity
public class Piec extends Music {
    
    private String type;

    public Piec(String artist, String type) {
        super(artist);
        this.type = type;
    }

    public Piec() {
        super();
    }

    public String getType() {
       return type;
    }
}
