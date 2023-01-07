package ch.zhaw.springboot.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class Composition extends Music {

    private String title;

    @OneToMany
    private List<Music> musics;

    public Composition(String artist, String title) {
        super(artist);
        this.title = title;
        this.musics = new ArrayList<Music>();
    }

    public Composition() {
        super();
    }

    public String getTitle() {
        return title;
    }

    public void addMusic(Music music) {
        this.musics.add(music);
    }
}
