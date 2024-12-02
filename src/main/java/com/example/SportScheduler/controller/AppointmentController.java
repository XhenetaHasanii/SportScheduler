package com.example.SportScheduler.controller;

import com.example.SportScheduler.dto.AppointmentDTO;
import com.example.SportScheduler.model.Appointment;
import com.example.SportScheduler.service.AppointmentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping("/api/appointment")
@CrossOrigin(origins = "http://localhost:3000")
public class

AppointmentController {
    private final AppointmentService appointmentService;

    public AppointmentController(AppointmentService appointmentService) {
        this.appointmentService = appointmentService;
    }

    @PostMapping("/addNewAppointment")
    public ResponseEntity<Appointment> addNewAppointment(@RequestBody AppointmentDTO appointmentDTO) {
        Appointment createdAppointment = appointmentService.addNewAppointment(appointmentDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(createdAppointment);

    }

    @GetMapping("/getAllAppointments")
    public Iterable<Appointment> getAllAppointments() {
        return appointmentService.getAllAppointments();
    }
}
