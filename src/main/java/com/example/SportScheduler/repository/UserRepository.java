package com.example.SportScheduler.repository;
import com.example.SportScheduler.model.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
 public interface UserRepository  extends CrudRepository<User, Long> {

    Optional<User> findByUsername(String username);
    boolean existsByEmail (String email);

}
