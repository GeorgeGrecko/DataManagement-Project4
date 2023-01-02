package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Bestellungen {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private Kunden kunden;

    @ManyToOne
    private Lieferaddressen lieferaddressen;

    @ManyToOne
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
