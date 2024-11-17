package com.example.SportScheduler.model;

import jakarta.persistence.*;

@Entity
@Table(name = "sport-hall_table")
public class Sporthall {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String sport_id;
    private String name;

    public Sporthall(String sport_id, String name) {
        this.sport_id = sport_id;
        this.name = name;
    }

    public String getSport_id() {
        return sport_id;
    }

    public void setSport_id(String sport_id) {
        this.sport_id = sport_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}