package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Produkte {
    @Id
    private long id;

    private String name;
    private long preis;

    @ManyToOne
    private Bestellungen bestellung;
    private Lieferanten lieferant;

    public Produkte(String name, long preis, Lieferanten lieferant, Bestellungen bestellung) {
        this.name = name;
        this.preis = preis;
        this.lieferant = lieferant;
        this.bestellung = bestellung;
    }

    public Produkte() {

    }

    public String getname() {
        return name;
    }

    public long getPreis() {
        return preis;
    }

    public Lieferanten getLieferant() {
        return lieferant;
    }

    public Bestellungen getBestellung() {
        return bestellung;
    }
}
