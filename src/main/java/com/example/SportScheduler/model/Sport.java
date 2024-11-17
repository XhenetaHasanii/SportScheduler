package com.example.SportScheduler.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Sport")
public class Sport {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String sport_id;
    private String name;
    private int numberOfPlayers;

    public Sport(String sport_id, String name, int numberOfPlayers) {
        this.sport_id = sport_id;
        this.name = name;
        this.numberOfPlayers = numberOfPlayers;
    }

    private String getSport_id() {
        return sport_id;
    }

    private void setSport_id(String sport_id) {
        this.sport_id = sport_id;
    }

    private String getName() {
        return name;
    }

    private void setName() {
        this.name = name;
    }

    private int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    private void setNumberOfPlayers(int numberOfPlayers) {
        this.numberOfPlayers = numberOfPlayers;
    }
}
