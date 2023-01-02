package ch.zhaw.springboot.entities;

import org.hibernate.boot.registry.selector.spi.StrategySelectionException;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity // 1: Annotate with @Entity
public class Lieferant { // 0: Regula Java class with attributes, constructor, methods
    @Id // 2: Create class attribute for primary key and annotate with @Id
    private long id;

    private String firma;
   
    @ManyToOne
    private Produkt produkt;

    //Not relevant how the id attribute is specified
    
    public Lieferant (String firma, Produkt produkt) {
        this.firma = firma;
        this.produkt = produkt;
    }

    public Lieferant() { // 3. Provide default constroctor if non-default is present

    }
    
    public String getFirma() {
        return firma;
    }

    public Produkt getProdukt() {
        return this.produkt;
    }

    
}
