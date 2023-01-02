package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Bestellungen {
    @Id
    private long id;

    @ManyToOne
    private Kunden kunden;
    private Lieferaddressen lieferaddressen;
    private Zahlungsarten zahlungsarten;

    public Bestellungen (Kunden kunden, Lieferaddressen lieferaddressen, Zahlungsarten zahlungsarten) {
        this.kunden = kunden;
        this.lieferaddressen = lieferaddressen;
        this.zahlungsarten = zahlungsarten;
    }

    public Bestellungen() {

    }

    public Kunden getKunden() {
        return this.kunden;
    }

    public Zahlungsarten getZahlungsart() {
        return this.zahlungsarten;
    }

    public Lieferaddressen getIdLieferadresse() {
        return this.lieferaddressen;
    }
}
