package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.springboot.entities.Zahlungsarten;

public interface ZahlungsartenRepository extends JpaRepository<Zahlungsarten, Long>{

}
