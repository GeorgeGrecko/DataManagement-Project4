package ch.zhaw.springboot.entities;

import org.hibernate.boot.registry.selector.spi.StrategySelectionException;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity // 1: Annotate with @Entity
public class Lieferaddresse { // 0: Regula Java class with attributes, constructor, methods
    @Id // 2: Create class attribute for primary key and annotate with @Id
    private long id;

    private String strasse;
    private String ort;
   

    //Not relevant how the id attribute is specified
    
    public Lieferaddresse (String strasse, String ort) {
        this.strasse = strasse;
        this.ort = ort;
    }

    public Lieferaddresse() { // 3. Provide default constroctor if non-default is present

    }
    
    public String getStrasse() {
        return strasse;
    }

    public String getOrt() {
        return ort;
    }
    // this.name in getName only because of company guidlines (not requiered), same function as getPhone - return phone;

    
}
