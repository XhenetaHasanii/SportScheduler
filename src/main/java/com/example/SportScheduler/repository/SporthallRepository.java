package com.example.SportScheduler.repository;

import com.example.SportScheduler.model.Sporthall;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SporthallRepository extends CrudRepository<Sporthall, Long>{


}
