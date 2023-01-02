package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.springboot.entities.Lieferaddressen;

public interface LieferaddressenRepository extends JpaRepository<Lieferaddressen, Long>{

}
