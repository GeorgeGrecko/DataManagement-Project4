package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity 
public class Lieferaddressen { 
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String strasse;
    private String ort;
       
    public Lieferaddressen (String strasse, String ort) {
        this.strasse = strasse;
        this.ort = ort;
    }

    public Lieferaddressen() { 

    }
    
    public String getStrasse() {
        return strasse;
    }

    public String getOrt() {
        return ort;
    }   
}
