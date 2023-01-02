package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.springboot.entities.Produkte;

public interface ProdukteRepository extends JpaRepository<Produkte, Long>{

}
