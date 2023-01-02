package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.springboot.entities.Lieferanten;

public interface LieferantenRepository extends JpaRepository<Lieferanten, Long>{

}
