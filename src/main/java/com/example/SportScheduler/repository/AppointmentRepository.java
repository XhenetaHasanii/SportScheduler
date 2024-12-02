package com.example.SportScheduler.repository;

import com.example.SportScheduler.model.Appointment;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AppointmentRepository extends CrudRepository<Appointment,Long> {
}
