package ch.zhaw.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Lieferanten;
import ch.zhaw.springboot.repositories.LieferantenRepository;

@RestController
public class LieferantRestController {

    @Autowired
    private LieferantenRepository repository;

    @RequestMapping(value="datamanagement4/Lieferanten", method=RequestMethod.GET)
    public ResponseEntity<List<Lieferanten>> getLieferantens() {
        List<Lieferanten> result = this.repository.findAll();
        return new ResponseEntity<List<Lieferanten>>(result, HttpStatus.OK);
    }
}
