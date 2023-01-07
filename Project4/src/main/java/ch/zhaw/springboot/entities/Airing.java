package ch.zhaw.springboot.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Airing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    private String date;

    @ManyToOne
    private Concert concert;

    @ManyToOne
    private Music music;

    public Airing(String date, Concert concert, Music music) {
        this.date = date;
        this.concert = concert;
        this.music = music;
    }

    public Airing() {

    }

    public String getDate() {
        return date;
    }

    public Concert getConcert() {
        return this.concert;
    }

    public Music getMusic() {
        return this.music;
    }
}
