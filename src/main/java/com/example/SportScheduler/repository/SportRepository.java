package com.example.SportScheduler.repository;

import com.example.SportScheduler.model.Sport;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportRepository extends CrudRepository<Sport, Long> {
}
