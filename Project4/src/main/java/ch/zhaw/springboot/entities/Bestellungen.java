package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Bestellungen {
    @Id
    private long id;

    @ManyToOne
    private Kunden kunde;
    private Lieferaddressen lieferaddresse;
    private Zahlungsarten zahlungsart;

    public Bestellungen (Kunden kunde, Lieferaddressen lieferaddresse, Zahlungsarten zahlungsart) {
        this.kunde = kunde;
        this.lieferaddresse = lieferaddresse;
        this.zahlungsart = zahlungsart;
    }

    public Bestellungen() {

    }

    public Kunden getKunden() {
        return this.kunde;
    }

    public Zahlungsarten getZahlungsart() {
        return this.zahlungsart;
    }

    public Lieferaddressen getIdLieferadresse() {
        return this.lieferaddresse;
    }
}
