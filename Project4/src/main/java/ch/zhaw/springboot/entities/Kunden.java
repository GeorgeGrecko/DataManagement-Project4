package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Kunden {
    @Id
    private long id;
    private String name;
    private String telefon;

    public Kunden (String name, String telefon) {
        this.name = name;
        this.telefon = telefon;
    }

    public Kunden() {

    }

    public String getName() {
        return this.name;
    }

    public String getTelefon() {
        return telefon;
    }
}
