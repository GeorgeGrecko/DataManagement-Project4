package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.springboot.entities.Music;

public interface MusicRepository extends JpaRepository<Music, Long>{
    
}
