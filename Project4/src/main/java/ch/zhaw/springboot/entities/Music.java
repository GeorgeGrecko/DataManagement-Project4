package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Music { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String artist;

    @ManyToOne
    private Composition composition;
       
    public Music (String artist) {
        this.artist = artist;
    }

    public Music() { 

    }

    public String getArtist() {
        return artist;
    }

    public void setComposition(Composition composition) {
        this.composition = composition;
    }

    public Composition getComposition() {
        return composition;
    }

    public boolean isEmpty() {
        return false;
    }
}
