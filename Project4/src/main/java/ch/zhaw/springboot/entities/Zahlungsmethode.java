package ch.zhaw.springboot.entities;

<<<<<<< HEAD
public class Zahlungsmethode {
    
=======
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Zahlungsmethode {
    
    @Id
    private long id;

    private String art;

    public Zahlungsmethode(String art) {
        this.art = art;
    }

    public Zahlungsmethode() {

    }

    public String getArt() {
       return art;
    }

>>>>>>> fe565ccd4ad647daf578c6926d206b3078751f59
}
