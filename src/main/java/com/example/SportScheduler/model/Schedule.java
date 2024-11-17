package com.example.SportScheduler.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "schedule_table")

public class Schedule {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String schedule_id;
    private List<Appointment> appointmentList;
}
