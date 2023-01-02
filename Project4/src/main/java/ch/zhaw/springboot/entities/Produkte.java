package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Produkte {
    @Id
    private long id;
    private String name;
    private long preis;
    private long idLieferant;
    private long idBestellung;

public Produkte (String name, long preis, long idLieferant, long idBestellung) {
    this.name = name;
    this.preis = preis;
    this.idLieferant = idLieferant;
    this.idBestellung = idBestellung;
}

public Produkte() {

}

public String getname() {
    return this.name;
}

public long getPreis() {
    return this.preis;
}

public long getIdLieferant() {
    return this.idLieferant;
}

public long getIdBestellung() {
    return this.idBestellung;
}

}

