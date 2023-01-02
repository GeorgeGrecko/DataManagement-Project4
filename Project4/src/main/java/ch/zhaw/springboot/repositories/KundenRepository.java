package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.springboot.entities.Kunden;

public interface KundenRepository extends JpaRepository<Kunden, Long>{
    
}
