package ch.zhaw.springboot.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Music;
import ch.zhaw.springboot.repositories.MusicRepository;

@RestController
public class MusicRestController {

    @Autowired
    private MusicRepository repository;

    @RequestMapping(value = "projectX/Music", method = RequestMethod.GET)
    public ResponseEntity<List<Music>> getMusics() {
        List<Music> result = this.repository.findAll();
        return new ResponseEntity<List<Music>>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "projectX/Music/{id}", method = RequestMethod.GET)
    public ResponseEntity<Music> getMusicById(@PathVariable("id") Long id) {
        Optional<Music> result = this.repository.findById(id);
        if (result.isPresent()) {
            return new ResponseEntity<Music>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<Music>(HttpStatus.NOT_FOUND);
        }
    }

}
