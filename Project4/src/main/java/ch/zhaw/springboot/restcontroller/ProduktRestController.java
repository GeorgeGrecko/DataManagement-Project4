package ch.zhaw.springboot.restcontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Produkte;
import ch.zhaw.springboot.repositories.ProdukteRepository;

@RestController
public class ProduktRestController {

    @Autowired
    private ProdukteRepository repository;

    @RequestMapping(value="datamanagement4/Produkte", method=RequestMethod.GET)
    public ResponseEntity<List<Produkte>> getProduktes() {
        List<Produkte> result = this.repository.findAll();
        return new ResponseEntity<List<Produkte>>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "datamanagement4/Produkte/inbetween/{min}/{max}", method = RequestMethod.GET)
    public ResponseEntity<List<Produkte>> getExpensesInBetween(@PathVariable("min") double min, @PathVariable("max") double max) {
        List<Produkte> result = this.repository.findByAmountInRange(min, max);
        return new ResponseEntity<List<Produkte>>(result, HttpStatus.OK);
    }
}
