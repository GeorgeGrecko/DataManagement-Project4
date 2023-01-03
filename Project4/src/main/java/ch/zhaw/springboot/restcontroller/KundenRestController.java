package ch.zhaw.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Kunden;
import ch.zhaw.springboot.repositories.KundenRepository;

@RestController
public class KundenRestController {

    @Autowired
    private KundenRepository repository;

    @RequestMapping(value="datamanagement4/Kunden", method=RequestMethod.GET)
    public ResponseEntity<List<Kunden>> getKundens() {
        List<Kunden> result = this.repository.findAll();
        return new ResponseEntity<List<Kunden>>(result, HttpStatus.OK);
    }
}
