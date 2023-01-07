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

import ch.zhaw.springboot.entities.Concert;
import ch.zhaw.springboot.repositories.ConcertRespository;

@RestController
public class ConcertRestController {

    @Autowired
    private ConcertRespository repository;

    @RequestMapping(value="projectX/Concert", method=RequestMethod.GET)
    public ResponseEntity<List<Concert>> geConcerts() {
        List<Concert> result = this.repository.findAll();
        return new ResponseEntity<List<Concert>>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "projectX/Concert/{id}", method = RequestMethod.GET)
    public ResponseEntity<Concert> getConcertById(@PathVariable("id") Long id) {
        Optional<Concert> result = this.repository.findById(id);
        if (result.isPresent()) {
            return new ResponseEntity<Concert>(result.get(), HttpStatus.OK);
        } else {
            return new ResponseEntity<Concert>(HttpStatus.NOT_FOUND);
        }
    }
}
