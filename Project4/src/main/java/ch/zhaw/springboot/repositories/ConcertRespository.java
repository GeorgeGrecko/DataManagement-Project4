package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.springboot.entities.Concert;

public interface ConcertRespository extends JpaRepository<Concert, Long>{
    
}
