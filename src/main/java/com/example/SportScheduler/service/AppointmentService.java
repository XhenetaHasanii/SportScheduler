package com.example.SportScheduler.service;

import com.example.SportScheduler.dto.AppointmentDTO;
import com.example.SportScheduler.model.Appointment;
import com.example.SportScheduler.repository.AppointmentRepository;
import com.example.SportScheduler.repository.UserRepository;
import org.springframework.stereotype.Service;

@Service
public class AppointmentService {
    private final AppointmentRepository appointmentRepository;
    private final UserRepository userRepository;

    public AppointmentService(AppointmentRepository appointmentRepository, UserRepository userRepository) {
        this.appointmentRepository = appointmentRepository;
        this.userRepository = userRepository;
    }

    public Appointment addNewAppointment(AppointmentDTO appointmentDTO) {
        Appointment appointment = new Appointment();
        appointment.setTime(appointmentDTO.getTime());
        appointment.setSporthall(appointmentDTO.getSporthall());
        appointment.setSportType(appointment.getSportType());
        appointment.setNumberOfPlayers(appointment.getNumberOfPlayers());
        return appointmentRepository.save(appointment);
    }

    public Iterable<Appointment> getAllAppointments() {
        return appointmentRepository.findAll();
    }
}
