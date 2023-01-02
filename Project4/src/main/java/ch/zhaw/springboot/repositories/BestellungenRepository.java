package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.springboot.entities.Bestellungen;

public interface BestellungenRepository extends JpaRepository<Bestellungen, Long>{

}
