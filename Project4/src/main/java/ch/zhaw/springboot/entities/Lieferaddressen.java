package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Lieferaddressen { 
    @Id 
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
