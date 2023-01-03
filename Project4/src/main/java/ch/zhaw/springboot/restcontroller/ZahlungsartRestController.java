package ch.zhaw.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Zahlungsarten;
import ch.zhaw.springboot.repositories.ZahlungsartenRepository;

@RestController
public class ZahlungsartRestController {

    @Autowired
    private ZahlungsartenRepository repository;

    @RequestMapping(value="datamanagement4/Zahlungsarten", method=RequestMethod.GET)
    public ResponseEntity<List<Zahlungsarten>> getZahlungsartens() {
        List<Zahlungsarten> result = this.repository.findAll();
        return new ResponseEntity<List<Zahlungsarten>>(result, HttpStatus.OK);
    }
}
