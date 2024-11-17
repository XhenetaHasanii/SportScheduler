package com.example.SportScheduler.model;

import jakarta.persistence.*;

@Entity
@Table(name = "player_table")

public class Player {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private String player_id;
    private String name;

    public Player(String player_id, String name) {
        this.player_id = player_id;
        this.name = name;
    }

    public String getPlayer_id() {
        return player_id;
    }

    public void setPlayer_id(String player_id) {
        this.player_id = player_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
