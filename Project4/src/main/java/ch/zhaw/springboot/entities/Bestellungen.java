package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Bestellungen {
    @Id
    private long id;
    private long idZahlungsart;
    private long idLieferadresse;

    @ManyToOne
    private Kunden kunde;

    public Bestellungen (Kunden kunde, long idZahlungsart, long idLieferadresse) {
        this.kunde = kunde;
        this.idZahlungsart = idZahlungsart;
        this.idLieferadresse = idLieferadresse;
    }

    public Bestellungen() {

    }

    public Kunden getKunden() {
        return kunde;
    }

    public long getIdZahlungsart() {
        return idZahlungsart;
    }

    public long getIdLieferadresse() {
        return idLieferadresse;
    }
}
