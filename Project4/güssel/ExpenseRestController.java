package ch.zhaw.springboot.restcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import ch.zhaw.springboot.entities.Expense;
import ch.zhaw.springboot.repositories.ExpenseRepository;

@RestController
public class ExpenseRestController {
    
    @Autowired
    private ExpenseRepository repository;

    @RequestMapping(value = "expenses/expenses/{id}", method = RequestMethod.GET)
    public ResponseEntity<Expense> getExpensesById(@PathVariable("id") long id) {
        Optional<Expense> result = this.repository.findById(id);
        if (result.isEmpty()) {
            return new ResponseEntity<Expense>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Expense>(result.get(), HttpStatus.OK);
    }

    @RequestMapping(value="expenses/expenses", method=RequestMethod.GET)
    public ResponseEntity<List<Expense>> getExpenses() {
        List<Expense> result = this.repository.findAll();
        return new ResponseEntity<List<Expense>>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "expenses/expenses/greaterthan/{min}", method = RequestMethod.GET)
    public ResponseEntity<List<Expense>> getExpensesGreaterThan(@PathVariable("min") double min) {
        List<Expense> result = this.repository.findByAmountGreaterThan(min);
        return new ResponseEntity<List<Expense>>(result, HttpStatus.OK);
    }

    @RequestMapping(value = "expenses/expenses/inbetween/{min}/{max}", method = RequestMethod.GET)
    public ResponseEntity<List<Expense>> getExpensesInBetween(@PathVariable("min") double min, @PathVariable("max") double max) {
        List<Expense> result = this.repository.findByAmountInRange(min, max);
        return new ResponseEntity<List<Expense>>(result, HttpStatus.OK);
    }

}
