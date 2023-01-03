package ch.zhaw.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Lieferaddressen;
import ch.zhaw.springboot.repositories.LieferaddressenRepository;

@RestController
public class LieferaddressenRestController {

    @Autowired
    private LieferaddressenRepository repository;

    @RequestMapping(value="datamanagement4/Lieferadressen", method=RequestMethod.GET)
    public ResponseEntity<List<Lieferaddressen>> getLieferaddressens() {
        List<Lieferaddressen> result = this.repository.findAll();
        return new ResponseEntity<List<Lieferaddressen>>(result, HttpStatus.OK);
    }
}
