package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Produkt {
    @Id
    private long id;
    private String produktname;
    private long preis;
    private long lieferantenId;

public Produkt (String produktname, long preis, long lieferantenId) {
    this.produktname = produktname;
    this.preis = preis;
    this.lieferantenId = lieferantenId;
}

public Produkt() {

}

public String getProduktname() {
    return this.produktname;
}

public long getPreis() {
    return this.preis;
}

public long getLieferantenId() {
    return this.lieferantenId;
}

}

