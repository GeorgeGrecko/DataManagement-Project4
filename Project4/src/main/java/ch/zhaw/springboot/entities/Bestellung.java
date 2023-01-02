package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Bestellung {
    @Id
    private long id;
    private long kundenId;
    private long produkteId;
    private long zahlungsmethodenId;

    public Bestellung (long kundenId, long produkteId, long zahlungsmethodenId) {
        this.kundenId = kundenId;
        this.produkteId = produkteId;
        this.zahlungsmethodenId = zahlungsmethodenId;
    }

    public Bestellung() {

    }

    public long getKundenId() {
        return this.kundenId;
    }

    public long getProdukteId() {
        return this.produkteId;
    }

    public long getZahlungsmethodenId() {
        return this.zahlungsmethodenId;
    }
    
}
