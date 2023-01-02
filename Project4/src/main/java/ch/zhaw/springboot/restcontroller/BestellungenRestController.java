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

@RestController // 1: annotation
public class BestellungenRestController {

    @Autowired
    private BestellungenRepository repository; // 2: acces to repository

    // 3. One endpoint: 3.1, 3.2, 3.3
    @RequestMapping(value="datamanagement4/Bestellungen", method=RequestMethod.GET) // 3.1 endpoint declaration incl. url & method
    public ResponseEntity<List<Bestellungen>> getBestellungens() { // 3.2: Java method to be executed
        // 3.3 implement behavior
        List<Bestellungen> result = this.repository.findAll();
        return new ResponseEntity<List<Bestellungen>>(result, HttpStatus.OK);
    }
}
