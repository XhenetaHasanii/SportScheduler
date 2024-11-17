package com.example.SportScheduler.model;

import jakarta.persistence.*;


import java.time.LocalTime;
import java.util.List;

@Entity
@Table(name = "appointment_table")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String appointment_id;
    private Sport sportType;
    private int numberOfPlayers;
    private List<Player> playerList;
    private Sporthall sporthall;
    private LocalTime time;
}
