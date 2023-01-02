package ch.zhaw.springboot.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import ch.zhaw.springboot.entities.Friend;

public interface FriendRepository extends JpaRepository<Friend, Long>{
    
}
