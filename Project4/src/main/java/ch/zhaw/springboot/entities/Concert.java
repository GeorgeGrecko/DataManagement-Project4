package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Concert {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    
    private String name;
    private String location;

    public Concert (String name, String location) {
        this.name = name;
        this.location = location;
    }

    public Concert() {

    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }
}
