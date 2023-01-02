package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.springboot.entities.Lieferadressen;

public interface LieferadressenRepository extends JpaRepository<Lieferadressen, Long>{

}
