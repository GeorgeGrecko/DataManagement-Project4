package ch.zhaw.springboot.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import ch.zhaw.springboot.entities.Produkte;

public interface ProdukteRepository extends JpaRepository<Produkte, Long>{
    @Query("SELECT p FROM Produkte p WHERE p.preis > ?1 AND p.preis < ?2")
    public List<Produkte> findByAmountInRange(double min, double max); 
    
}
