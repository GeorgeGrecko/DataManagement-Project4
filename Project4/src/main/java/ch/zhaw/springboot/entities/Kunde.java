package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Kunde {
    @Id
    private long id;
    private String name;
    private String telefon;

    public Kunde (String name, String telefon) {
        this.name = name;
        this.telefon = telefon;
    }

    public Kunde() {

    }

    public String getName() {
        return this.name;
    }

    public String getTelefon() {
        return telefon;
    }
}
