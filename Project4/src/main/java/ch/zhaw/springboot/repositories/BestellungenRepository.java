package ch.zhaw.springboot.repositories;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ch.zhaw.springboot.entities.Bestellungen;

public interface BestellungenRepository extends JpaRepository<Bestellungen, Long>{

    public List<Bestellungen> findByAmountGreaterThan(double min); //Derived Querry z.B. baeldung.com

    @Query("SELECT e FROM Expense e WHERE e.amount > ?1 AND e.amount < ?2") // Expense =  Java Klassenname ? = platzhalter und ?1 erstes Argument z.B. hier = min
    public List<Bestellungen> findByAmountInRange(double min, double max); //Änderungen in Repository geben Bonuspunkte
}
