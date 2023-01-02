package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bestellungen {
    @Id
    private long id;
    private long idKunde;
    private long idZahlungsart;
    private long idLieferadresse;

    public Bestellungen (long idKunde, long idZahlungsart, long idLieferadresse) {
        this.idKunde = idKunde;
        this.idZahlungsart = idZahlungsart;
        this.idLieferadresse = idLieferadresse;
    }

    public Bestellungen() {

    }

    public long getIdKunde() {
        return this.idKunde;
    }

    public long getIdZahlungsart() {
        return this.idZahlungsart;
    }

    public long getIdLieferadresse() {
        return this.idLieferadresse;
    }
    
}
