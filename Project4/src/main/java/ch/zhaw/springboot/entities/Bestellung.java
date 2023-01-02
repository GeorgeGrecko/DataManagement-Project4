package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bestellung {
    @Id
    private long id;
    private long kundenId;
    private long produktId;
    private long zahlungsmethodenId;

    public Bestellung (long kundenId, long produktId, long zahlungsmethodenId) {
        this.kundenId = kundenId;
        this.produktId = produktId;
        this.zahlungsmethodenId = zahlungsmethodenId;
    }

    public Bestellung() {

    }

    public long getKundenId() {
        return this.kundenId;
    }

    public long getProdukteId() {
        return this.produktId;
    }

    public long getZahlungsmethodenId() {
        return this.zahlungsmethodenId;
    }
    
}
