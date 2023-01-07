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

import ch.zhaw.springboot.entities.Airing;
import ch.zhaw.springboot.repositories.AiringRespository;

@RestController
public class AiringRestController {

    @Autowired
    private AiringRespository repository;

    @RequestMapping(value = "projectX/Airing", method = RequestMethod.GET)
    public ResponseEntity<List<Airing>> getAirings() {
        List<Airing> result = this.repository.findAll();
        return new ResponseEntity<List<Airing>>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "projectX/Airing/{id}", method = RequestMethod.GET)
    public ResponseEntity<Airing> getAiringById(@PathVariable("id") Long id) {
        Optional<Airing> result = this.repository.findById(id);
        if (result.isPresent()) {
            return new ResponseEntity<Airing>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<Airing>(HttpStatus.NOT_FOUND);
        }
    }
}
