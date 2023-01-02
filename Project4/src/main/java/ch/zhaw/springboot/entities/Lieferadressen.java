package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity 
public class Lieferadressen { 
    @Id 
    private long id;
    private String strasse;
    private String ort;
       
    public Lieferadressen (String strasse, String ort) {
        this.strasse = strasse;
        this.ort = ort;
    }

    public Lieferadressen() { 

    }
    
    public String getStrasse() {
        return strasse;
    }

    public String getOrt() {
        return ort;
    }   
}
