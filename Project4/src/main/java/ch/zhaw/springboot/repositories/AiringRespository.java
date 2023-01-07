package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.springboot.entities.Airing;

public interface AiringRespository extends JpaRepository<Airing, Long>{

}
