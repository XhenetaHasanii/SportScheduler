package com.example.SportScheduler.repository;
import com.example.SportScheduler.model.Player;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface  PlayerRepository extends CrudRepository<Player, Long> {
}
