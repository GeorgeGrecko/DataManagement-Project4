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
    private Bestellungen bestellungen;
    private Lieferanten lieferanten;

    public Produkte(String name, long preis, Lieferanten lieferanten, Bestellungen bestellungen) {
        this.name = name;
        this.preis = preis;
        this.lieferanten = lieferanten;
        this.bestellungen = bestellungen;
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
        return this.lieferanten;
    }

    public Bestellungen getBestellung() {
        return this.bestellungen;
    }
}
