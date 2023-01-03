package ch.zhaw.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Bestellungen;
import ch.zhaw.springboot.repositories.BestellungenRepository;

@RestController
public class BestellungenRestController {

    @Autowired
    private BestellungenRepository repository;
    
    @RequestMapping(value = "datamanagement4/Bestellungen", method = RequestMethod.GET)
    public ResponseEntity<List<Bestellungen>> getBestellungens() {
        List<Bestellungen> result = this.repository.findAll();
        return new ResponseEntity<List<Bestellungen>>(result, HttpStatus.OK);
    }

}
